package it.ing.sw.v4.p3;

import java.time.LocalDate;
import java.util.Vector;

import it.ing.sw.v4.p1.Fruitore;
import it.ing.sw.v4.p2.Categoria;
import it.ing.sw.v4.p2.Risorsa;

public class ArchivioPrestiti 
{
	private Vector <Prestito> elencoPrestiti;
	
	public static final String INTESTAZIONE_ELENCO = "Elenco dei prestiti in corso: \n";
    
	
	/**
	 * Metodo costruttore della classe ArchivioPrestiti
	 * 
	 * Post: elencoPrestiti != null
	 */
	public ArchivioPrestiti()
	{
		elencoPrestiti = new Vector <Prestito> ();
	}
	
	/**
	 * Metodo get per il ritorno dell'attributo elencoPrestiti
	 */
	public Vector<Prestito> getElencoPrestiti()
	{
		return elencoPrestiti;
	}
	
    /**
     * Metodo che dato lo username del fruitore restituisce il vettore contenente i prestiti fatti
     * dal fruitore avente usef come username
     * 
     * Pre: elencoPrestiti != null
     * 
     * @param usef: lo username del fruitore
     * @return il vettore contenente i prestiti fatti dal fruitore con username usef
     */
    public Vector <Prestito> getPrestiti(String usef)   
    {
      	Vector <Prestito> prestitiInCorso = new Vector <Prestito> ();
   	    
      	for(int i = 0; i < elencoPrestiti.size(); i++)
	    {
	    	    Prestito p = elencoPrestiti.get(i);
	    	  
	    	    if(((p.getFruitoreAssociato().getUsername().equals(usef))))
	    			    prestitiInCorso.add(p);
	    }
	    
		return prestitiInCorso;
    }
    
    /**
     * Metodo per la terminazione automatica del prestito di una risorsa
     * 
     * Pre: elencoPrestiti != null
     */
    public void scadenzaPrestito()
    {
   	 	for(int i = 0; i < elencoPrestiti.size() ; i++)
   	 	{
   	 		Prestito p = elencoPrestiti.get(i);	
   	 		
   	 		if((LocalDate.now().isAfter(p.getDataDiScadenzaPrestito())))
   	 		{
   	 			elencoPrestiti.remove(p);
   	 		}			
   	 	}  
    }
    
    /**
     * Metodo per l'aggiunta di un prestito all'archivio dei prestiti
     * 
     * Pre: (p != null) && !(elencoPrestiti.contains(p))
     * Post: elencoRisorse.contains(p)
     * 
     * @param p: il prestito da aggiungere
     */
	public void aggiungiPrestito(Prestito p)
	{
		elencoPrestiti.add(p);
	}
	
	/**
	 * Metodo per la rimozione di un prestito dall'archivio dei prestiti
	 * 
	 * Pre: (p != null) && (elencoRisorse.contains(p))
     * Post: !(elencoRisorse.contains(p))
	 * 
	 * @param p: il prestito da rimuovere
	 */
	public void rimuoviPrestito(Prestito p)
	{
		elencoPrestiti.remove(p);
	}
	
	/**
	 * Metodo che controlla che un fruitore abbia un numero di risorse in prestito relative ad una categoria
	 * inferiore al massimo numero di risorse in prestito fissato per quella categoria
	 * 
	 * Pre: (c != null) && (f != null)
	 * 
	 * @param c: la categoria di risorse di cui effettuare il controllo
	 * @param f: il fruitore di cui effettuare il controllo
	 * @return boolean: true se il fruitore ha un numero di risorse relative ad una stessa categoria minore a quello consentito 
	 *         per la categoria stessa
	 */
	public boolean controlloPerUlteriorePrestito(Categoria c, Fruitore f)
	{
		int num = 0;
		
      	for(int i = 0; i < elencoPrestiti.size(); i++)
	    {
	    	   Prestito p = elencoPrestiti.get(i);
	    	  
	    	   if(p.getCategoriaAssociata().equals(c) && p.getFruitoreAssociato().equals(f))
	    		  	 num++;
	    }
	    
	    if(c.getNumeroMaxRisorseInPrestito() > num)
	         return true;
	    else
	         return false;
	}
	
	/**
	 * Metodo per il controllo della disponibilita' di una risorsa
	 * 
	 * Pre: elencoPrestiti != null
	 * 
	 * @param r: la risorsa di cui effettuare il controllo
	 * @return boolean: true se il numero delle licenze della risorsa e' inferiore o uguale
	 *         al numero dei prestiti in cui la risorsa e' coinvolta
	 */
	public boolean controlloDisponibilitaRisorsa(Risorsa r)
	{
		int num = 0;
		
      	for(int i = 0; i < elencoPrestiti.size(); i++)
	    {
	    	   Prestito p = elencoPrestiti.get(i);
	    	  
	    	   if(p.getRisorsaInPrestito().equals(r))
	    		    	num++;
	    }
	    
	    if(r.getNumLicenze() > num)
	    	     return true;
	    else
	         return false;
	}

}