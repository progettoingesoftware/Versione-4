package it.ing.sw.v4.p2;

import java.io.Serializable;
import java.util.Vector;

/**
 * Questa classe rappresenta il modello di un Libro
 */
public class Libro extends Risorsa implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String titolo;
    private Vector <String> autore_i; 
    private int numPagine;
    private int annoPub;
    private String casaEditrice;
    private String lingua;
    private String genere;
    
    public static final String DESCRIZIONE_LIBRO = "Titolo: %s\n\t\tAutore/i: %s\n\t\tNumero licenze: %d\n\t\tNumero pagine: %d\n\t\tAnno di pubblicazione: %d\n\t\tCasa editrice: %s\n\t\tLingua: %s\n\t\tGenere: %s\n";
    
    /**
     * Metodo costruttore della classe Libro
     * 
     * Pre: a != null
     * Post: autore_i != null
     * 
     * @param licenze: numero delle licenze del libro
     * @param t: titolo del libro
     * @param a: autore/i del libro
     * @param np: numero delle pagine del libro
     * @param ap: anno di pubblicazione del libro
     * @param ce: casa editrice del libro
     * @param l: lingua in cui e' scritto il libro
     * @param g: genere del libro
     */
    public Libro(int licenze, String t, Vector <String> a, int np, int ap, String ce, String l, String g)
    {
    	   super(t, licenze);
    	   this.autore_i = a;
    	   this.titolo = t;
    	   this.numPagine = np;
    	   this.annoPub = ap;
    	   this.casaEditrice = ce;
    	   this.lingua = l;
    	   this.genere = g;
    }
    
    /**
     * Metodi get per il ritorno dei vari attributi della classe Libro
     */
    public String getTitolo()
    {
    	    return titolo;
    }
    
    public String getAutore()
    {
        	StringBuffer aut = new StringBuffer();
        
        	for(int i = 0; i < autore_i.size(); i++)
        	{
     	       	aut.append(autore_i.get(i));
     	       	if(i < autore_i.size()-1)
     	       		aut.append("-");
        	}
        	
        	return aut.toString();
    }
    
    public int getAnnoPub()
    {
    	    return annoPub;
    }
    
    public String getCasaEditrice()
    {
    	    return casaEditrice;
    }
    
    public String getGenere()
    {
    	    return genere;
    }
    
    /**
     * Metodo toString() per la creazione di una stringa descrittiva contenente i vari attributi dell'oggetto Libro
     * 
     * Pre: autore_i != null
     * 
     * @return la stringa descrittiva del libro
     */
    public String toString()
    {
       StringBuffer ris = new StringBuffer();
       String aut = getAutore();
       
       ris.append(String.format(DESCRIZIONE_LIBRO, titolo, aut, getNumLicenze(), numPagine, annoPub, casaEditrice, lingua, genere));
       return ris.toString();
    }
    
}