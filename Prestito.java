package it.ing.sw.v4.p3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import it.ing.sw.v4.p1.Fruitore;
import it.ing.sw.v4.p2.Risorsa;
import it.ing.sw.v4.p2.Categoria;

public class Prestito 
{
	private LocalDate dataDiInizioPrestito;
	private LocalDate dataDiScadenzaPrestito;
	private Categoria categoriaAssociata;
	private Fruitore fruitoreAssociato;
	private Risorsa risorsaInPrestito;
	private boolean prorogaNonEffettuata;
	
    public static final String DESCRIZIONE_PRESTITO = "Categoria della risorsa in prestito:\n%s\nRisorsa presa in prestito:\n%s\nData inizio prestito:\n%s\nData scadenza prestito:\n%s\n";
	
	/**
	 * Metodo costruttore della classe Prestito
	 * 
	 * Pre: (c != null) && (f != null) && (r != null)
	 * Post: dataDiScadenzaPrestito == dataDiInizioPrestito.plusDays(categoriaAssociata.getNumeroMaxGiorniPrestito())
	 * 
	 * @param c: la categoria della risorsa in prestito
	 * @param f: il fruitore che ha in prestito la risorsa
	 * @param r: la risorsa in prestito
	 */
	public Prestito(Categoria c, Fruitore f, Risorsa r)
	{
		this.dataDiInizioPrestito = LocalDate.now();
		this.categoriaAssociata = c;
		this.dataDiScadenzaPrestito = dataDiInizioPrestito.plusDays(categoriaAssociata.getNumeroMaxGiorniPrestito());
		this.fruitoreAssociato = f;
		this.risorsaInPrestito = r;
		this.prorogaNonEffettuata = true;
	}
	
	/**
	 * Metodi get per il ritorno dei vari attributi della classe Prestito
	 */
	public LocalDate getDataDiInizioPrestito()
	{
		return dataDiInizioPrestito;
	}
	
	public LocalDate getDataDiScadenzaPrestito()
	{
		return dataDiScadenzaPrestito;
	}
	
	public Categoria getCategoriaAssociata()
	{
		return categoriaAssociata;
	}
	
	public Fruitore getFruitoreAssociato()
	{
		return fruitoreAssociato;
	}
	
	public Risorsa getRisorsaInPrestito()
	{
		return risorsaInPrestito;
	}
	
	public boolean getProrogaNonEffettuata()
	{
		return prorogaNonEffettuata;
	}
	
	/**
	 * Metodi set per modificare i vari attributi della classe Prestito
	 */
	public void setProrogaNonEffettuata()
	{
		prorogaNonEffettuata = false;
	}
	
	public void setDataDiScadenzaPrestito(LocalDate nuovads)
	{
		dataDiScadenzaPrestito = nuovads;
	}
	
	/**
     * Metodo che verifica se le condizioni per effettuare la proroga di un prestito siano soddisfatte o no
     * 
     * Pre: elencoPrestiti != null
     * 
     * @param daProrogare: il prestito di cui richiedere la proroga
     * @return true se le condizioni per effettuare la proroga del prestito sono soddisfatte
     */
    public boolean prorogaPrestito()
    {
    	   /**
   	 	* Il primo if verifica che non sia già stata effettuata la proroga per il prestito
   	 	* Il secondo if verifica che la proroga sia richiesta nel corretto intervallo di tempo
   	 	*/
        if(prorogaNonEffettuata)
   	    {
   	 		if((LocalDate.now().isBefore(dataDiScadenzaPrestito)))
   	 		{
       	 		if((LocalDate.now().isAfter(dataDiScadenzaPrestito.minusDays(categoriaAssociata.getNumeroGiorniRichiestaProroga()))))
       	 		{
   	 				setDataDiScadenzaPrestito(LocalDate.now().plusDays(categoriaAssociata.getNumeroMaxGiorniProroga()));
       	 			setProrogaNonEffettuata();
   	 				return true;
       	 		}
       	    }
   	 	}
	    return false;
    }

	/**
     * Metodo toString() per la creazione di una stringa descrittiva di un prestito
     * @return la stringa descrittiva del prestito
     */
    public String toString()
    {
      	StringBuffer ris = new StringBuffer();
    	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Fruitore.FORMATO_DATA);
      	
      	ris.append(String.format(DESCRIZIONE_PRESTITO, categoriaAssociata.getNome(), risorsaInPrestito.toString(), dataDiInizioPrestito.format(formatter), dataDiScadenzaPrestito.format(formatter)));
        return ris.toString();
    } 
    
}
