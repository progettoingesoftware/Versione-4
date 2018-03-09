package it.ing.sw.v4.p4;

import java.io.Serializable;
import java.util.Vector;

import it.ing.sw.v4.p2.Risorsa;

public class Film extends Risorsa implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String titolo;
    private Vector <String> regista_i; 
    private Vector <String> produttore_i;
    private Vector <String> sceneggiatore_i;
    private Vector <String> interprete_i;
    private int durata;
    private int annoPub;
    private String casaProduzione;
    private String lingua;
    private String genere;
    
    public static final String DESCRIZIONE_FILM = "Titolo: %s\n\t\tRegista/i: %s\n\t\tProduttore/i: %s\n\t\tSceneggiatore/i: %s\n\t\tInterprete/i: %s\n\t\tNumero licenze: %d\n\t\tDurata: %d\n\t\tAnno di pubblicazione: %d\n\t\tCasa di produzione: %s\n\t\tLingua: %s\n\t\tGenere: %s\n";
    
    /**
     * Metodo costruttore della classe Film
     * 
     * Pre: r != null
     * Pre: p != null
     * Pre: s != null
     * Pre: i != null
     * Post: regista_i != null
     * Post: produttore_i != null
     * Post: sceneggiatore_i != null
     * Post: interprete_i != null
     * 
     * @param licenze: numero delle licenze del film
     * @param t: titolo del film
     * @param r: regista/i del film
     * @param p: produttore/i del film
     * @param s: sceneggiatore/i del film
     * @param i: interprete/i del film
     * @param d: durata del film
     * @param ap: anno di pubblicazione del filme
     * @param cp: casa di produzione del film
     * @param l: lingua in cui e' scritto il film
     * @param g: genere del film
     */
    public Film(int licenze, String t, Vector <String> r, Vector <String> p, Vector <String> s, Vector <String> i, int d, int ap, String cp, String l, String g)
    {
    	   super(t, licenze);
    	   this.regista_i = r;
    	   this.produttore_i = p;
    	   this.sceneggiatore_i = s;
    	   this.interprete_i = i;
    	   this.titolo = t;
    	   this.durata = d;
    	   this.annoPub = ap;
    	   this.casaProduzione = cp;
    	   this.lingua = l;
    	   this.genere = g;
    }
    
    /**
     * Metodi get per il ritorno dei vari attributi della classe film
     */
    public String getTitolo()
    {
    	    return titolo;
    }
    
    public String getRegista()
    {
        	StringBuffer reg = new StringBuffer();
        
        	for(int i = 0; i < regista_i.size(); i++)
        	{
     	       	reg.append(regista_i.get(i));
     	       	if(i < regista_i.size()-1)
     	       		reg.append("-");
        	}
        	
        	return reg.toString();
    }
    
    public String getProduttore()
    {
        	StringBuffer prod = new StringBuffer();
        
        	for(int i = 0; i < produttore_i.size(); i++)
        	{
     	       	prod.append(produttore_i.get(i));
     	       	if(i < produttore_i.size()-1)
     	       		prod.append("-");
        	}
        	
        	return prod.toString();
    }
    
    public String getSceneggiatore()
    {
        	StringBuffer scen = new StringBuffer();
        
        	for(int i = 0; i < sceneggiatore_i.size(); i++)
        	{
     	       	scen.append(sceneggiatore_i.get(i));
     	       	if(i < sceneggiatore_i.size()-1)
     	       		scen.append("-");
        	}
        	
        	return scen.toString();
    }
    
    public String getInterprete()
    {
        	StringBuffer inter = new StringBuffer();
        
        	for(int i = 0; i < interprete_i.size(); i++)
        	{
     	       	inter.append(interprete_i.get(i));
     	       	if(i < interprete_i.size()-1)
     	       		inter.append("-");
        	}
        	
        	return inter.toString();
    }
    
    public int getAnnoPub()
    {
    	    return annoPub;
    }
    
    public String getCasaProduzione()
    {
    	    return casaProduzione;
    }
    
    public String getGenere()
    {
    	    return genere;
    }
    
    /**
     * Metodo toString() per la creazione di una stringa descrittiva contenente i vari attributi dell'oggetto Film
     * 
     * Pre: regista_i != null
     * Pre: regista_i != null
     * Pre: regista_i != null
     * Pre: regista_i != null
     * 
     * @return la stringa descrittiva del film
     */
    public String toString()
    {
       StringBuffer ris = new StringBuffer();
       String reg = getRegista();
       String prod = getProduttore();
       String scen = getSceneggiatore();
       String inter = getInterprete();

       ris.append(String.format(DESCRIZIONE_FILM, titolo, reg, prod, scen, inter, getNumLicenze(), durata, annoPub, casaProduzione, lingua, genere));
       return ris.toString();
    }
    
}