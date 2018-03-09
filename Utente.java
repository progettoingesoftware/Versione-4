package it.ing.sw.v4.p1;

import java.io.Serializable;
import java.util.Vector;

import it.ing.sw.v3.p2.Risorsa;
import it.ing.sw.v3.p3.ArchivioPrestiti;

/**
 * Questa classe rappresenta il modello di un Utente
 */
public class Utente implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String nome;
    private String cognome;
    private String username;
    private String password;
    
    /**
     * Metodo costruttore della classe Utente
     * @param n : nome dell'utente
     * @param c : cognome dell'utente
     * @param u : username dell'utente
     * @param p : password dell'utente
     */
    public Utente(String n, String c, String u, String p)
    {
    	     this.nome = n;
    	     this.cognome = c;
    	     this.username = u;
    	     this.password = p;
    }
    
    /**
     * Metodi get per il ritorno dei vari attributi della classe Utente
     */
    public String getNome()
    {
   	     return nome;
    }
    
    public String getCognome()
    {
   	     return cognome;
    }
    
    public String getUsername()
    {
   	     return username;
    }
    
    public String getPassword()
    {
   	     return password;
    }
    
    /**
     * Metodo che permette all'utente di effettuare la ricerca di una risorsa per titolo o per
     * una parola in esso contenuta
     * 
     * Pre: ap != null
     * 
     * @param ap: l'archivio prestiti in cui effettuare la ricerca
     * @param n: il titolo della risorsa o un nome in esso contenuto
     * @return il vettore con all'interno le risorse aventi n come titolo o n come una parola in esso contenuta
     */    
    public Vector<Risorsa> ricercaRisorsaPerTitolo(ArchivioPrestiti ap, String titolo)
    {
    	return ap.ricercaRisorsaPerTitolo(titolo);
    }
    
    /**
     * Metodo che permette all'utente di effettuare la ricerca di una risorsa per il nome o il cognome di uno 
     * dei suoi autori
     * 
     * Pre: ap != null
     * 
     * @param ap: l'archivio prestiti in cui effettuare la ricerca
     * @param n: il nome o il cognome di uno dei suoi autori
     * @return il vettore con all'interno le risorse aventi n come nome o cognome di uno dei suoi autori
     */
    public Vector<Risorsa> ricercaRisorsaPerAutore(ArchivioPrestiti ap, String autore)
    {
    	return ap.ricercaRisorsaPerAutore(autore);
    }
    
    /**
     * Metodo che permette all'utente di effettuare la ricerca di una risorsa per anno di pubblicazione
     * 
     * Pre: ap != null
     * 
     * @param ap: l'archivio prestiti in cui effettuare la ricerca
     * @param anno: l'anno di cui si vuole cercare la risorsa
     * @return il vettore con all'interno le risorse aventi anno come anno di pubblicazione
     */ 
    public Vector<Risorsa> ricercaRisorsaPerAnnoPubblicazione(ArchivioPrestiti ap, int anno)
    {
    	return ap.ricercaRisorsaPerAnnoPubblicazione(anno);
    }
    
    /**
     * Metodo che permette all'utente di effettuare la ricerca di una risorsa per casa editrice
     * 
     * Pre: ap != null
     * 
     * @param ap: l'archivio prestiti in cui effettuare la ricerca
     * @param casa: la casa editrice di cui si vuole cercare la risorsa
     * @return il vettore con all'interno le risorse aventi casa come casa editrice
     */
    public Vector<Risorsa> ricercaRisorsaPerCasaEditrice(ArchivioPrestiti ap, String casa)
    {
    	return ap.ricercaRisorsaPerCasaEditrice(casa);
    }
    
    public Vector<Risorsa> ricercaRisorsaPerRegista(ArchivioPrestiti ap, String casa)
    {
    	return ap.ricercaRisorsaPerCasaRegista(casa);
    }
    
    public Vector<Risorsa> ricercaRisorsaPerProduttore(ArchivioPrestiti ap, String casa)
    {
    	return ap.ricercaRisorsaPerProduttore(casa);
    }
    
    public Vector<Risorsa> ricercaRisorsaPerSceneggiatore(ArchivioPrestiti ap, String casa)
    {
    	return ap.ricercaRisorsaPerSceneggiatore(casa);
    }
    
    public Vector<Risorsa> ricercaRisorsaPerInterprete(ArchivioPrestiti ap, String casa)
    {
    	return ap.ricercaRisorsaPerInterprete(casa);
    }
    
    public Vector<Risorsa> ricercaRisorsaPerCasaProduzione(ArchivioPrestiti ap, String casa)
    {
    	return ap.ricercaRisorsaPerCasaProduzione(casa);
    }
    
}
