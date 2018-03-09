package it.ing.sw.v4.p3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Vector;

import it.ing.sw.InputDati;
import it.ing.sw.v4.p2.Libro;
import it.ing.sw.v4.p4.Film;

/**
 * Questa classe e' di appoggio per l'inserimento dei dati relativi ad una risorsa nei metodi aggiungiRisorsa() e 
 * rimuoviRisorsa() della classe GestoreMenu
 */
public class InserimentoRisorsa implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	public static final String INS_TITOLO_LIBRO = "Inserisci il titolo del libro:\n";
    public static final String INS_NUMLICENZE_LIBRO = "Inserisci il numero delle licenze del libro:\n";
    public static final String INS_AUTORE = "Inserisci l'autore del libro(uno alla volta):\n";
    public static final String INS_ALTRO_AUTORE = "Vuoi inserire un altro autore (S/N)?\n";
    public static final String INS_NUMPAGINE_LIBRO = "Inserisci il numero delle pagine del libro:\n";
    public static final String INS_ANNOP_LIBRO = "Inserisci l'anno di pubblicazione del libro:\n";
    public static final String INS_CASAED_LIBRO = "Inserisci la casa editrice del libro:\n";
    public static final String INS_LINGUA_LIBRO = "Inserisci la lingua in cui e' scritto il libro:\n";
    public static final String INS_GENERE_LIBRO = "Inserisci il genere del libro:\n";
    
	public static final String INS_TITOLO_FILM = "Inserisci il titolo del film:\n";
    public static final String INS_NUMLICENZE_FILM = "Inserisci il numero delle licenze del film:\n";
    public static final String INS_REGISTA = "Inserisci il regista del film(uno alla volta):\n";
    public static final String INS_ALTRO_REGISTA = "Vuoi inserire un altro regista (S/N)?\n";
    public static final String INS_PRODUTTORE = "Inserisci il produttore del film(uno alla volta):\n";
    public static final String INS_ALTRO_PRODUTTORE = "Vuoi inserire un altro produttore (S/N)?\n";
    public static final String INS_SCENEGGIATORE = "Inserisci lo sceneggiatore del film(uno alla volta):\n";
    public static final String INS_ALTRO_SCENEGGIATORE = "Vuoi inserire un altro sceneggiatore (S/N)?\n";
    public static final String INS_INTERPRETE = "Inserisci l'interprete del film(uno alla volta):\n";
    public static final String INS_ALTRO_INTERPRETE = "Vuoi inserire un altro interprete (S/N)?\n";
    public static final String INS_DURATA_FILM = "Inserisci il numero delle pagine del film:\n";
    public static final String INS_ANNOP_FILM = "Inserisci l'anno di pubblicazione del film:\n";
    public static final String INS_CASAPRO_FILM = "Inserisci la casa di produzione del film:\n";
    public static final String INS_LINGUA_FILM = "Inserisci la lingua in cui e' distribuito il film:\n";
    public static final String INS_GENERE_FILM = "Inserisci il genere del film:\n";
    
    public static final int ANNO_CORRENTE = LocalDate.now().getYear();

    public static final int MIN_LICENZE_LIBRO = 1;
    public static final int MAX_LICENZE_LIBRO = 20;
    public static final int MIN_LICENZE_FILM = 1;
    public static final int MAX_LICENZE_FILM = 50;
    public static final int MIN_ANNOP = 1900;
    
    /**
     * Metodo per l'acquisizione dei dati relativi ad un libro
     * @return l'oggetto libro costruito sulla base dei dati inseriti
     */
	public static Libro inserisciLibro()
    {
    	    String t = InputDati.leggiStringaNonVuota(INS_TITOLO_LIBRO);
    	    int nl = InputDati.leggiIntero(INS_NUMLICENZE_LIBRO, MIN_LICENZE_LIBRO, MAX_LICENZE_LIBRO);
    	    boolean end = false;
    	    Vector <String> a = new Vector <String> ();
    	    
    	    do
    	    {
    	    	    String autore = InputDati.leggiStringaNonVuota(INS_AUTORE);
    	    	    a.add(autore);
    	    	    
    	    	    if(InputDati.leggiUpperChar(INS_ALTRO_AUTORE, "SN") == 'N')
    	    	    	     end = true;
    	    	    
    	    }while(!end);
    	    
    	    int np = InputDati.leggiIntero(INS_NUMPAGINE_LIBRO);
    	    int ap = InputDati.leggiIntero(INS_ANNOP_LIBRO, MIN_ANNOP, ANNO_CORRENTE);
    	    String ce = InputDati.leggiStringaNonVuota(INS_CASAED_LIBRO);
    	    String l = InputDati.leggiStringaNonVuota(INS_LINGUA_LIBRO);
    	    String g = InputDati.leggiStringaNonVuota(INS_GENERE_LIBRO);
    	    		
    	    Libro lib = new Libro(nl, t, a, np, ap, ce, l, g);
    	    
    	    return lib;
    }
	
    /**
     * Metodo per l'acquisizione dei dati relativi ad un film
     * @return l'oggetto film costruito sulla base dei dati inseriti
     */
	public static Film inserisciFilm()
    {
    	    String t = InputDati.leggiStringaNonVuota(INS_TITOLO_FILM);
    	    int nf = InputDati.leggiIntero(INS_NUMLICENZE_FILM, MIN_LICENZE_FILM, MAX_LICENZE_FILM);
    	    boolean end;
    	    Vector <String> r = new Vector <String> ();
    	    Vector <String> p = new Vector <String> ();
    	    Vector <String> s = new Vector <String> ();
    	    Vector <String> i = new Vector <String> ();
    	    
    	    do
    	    {
    	    		end = false;
    	    	    String regista = InputDati.leggiStringaNonVuota(INS_REGISTA);
    	    	    r.add(regista);
    	    	    
    	    	    if(InputDati.leggiUpperChar(INS_ALTRO_REGISTA, "SN") == 'N')
    	    	    	     end = true;
    	    	    
    	    }while(!end);
    	    
    	    do
    	    {
    	    		end = false;
    	    	    String produttore = InputDati.leggiStringaNonVuota(INS_PRODUTTORE);
    	    	    p.add(produttore);
    	    	    
    	    	    if(InputDati.leggiUpperChar(INS_ALTRO_PRODUTTORE, "SN") == 'N')
    	    	    	     end = true;
    	    	    
    	    }while(!end);
    	    
    	    do
    	    {
    	    		end = false;
    	    	    String sceneggiatore = InputDati.leggiStringaNonVuota(INS_SCENEGGIATORE);
    	    	    s.add(sceneggiatore);
    	    	    
    	    	    if(InputDati.leggiUpperChar(INS_ALTRO_SCENEGGIATORE, "SN") == 'N')
    	    	    	     end = true;
    	    	    
    	    }while(!end);
    	    
    	    do
    	    {
    	    		end = false;
    	    	    String interprete = InputDati.leggiStringaNonVuota(INS_INTERPRETE);
    	    	    i.add(interprete);
    	    	    
    	    	    if(InputDati.leggiUpperChar(INS_ALTRO_INTERPRETE, "SN") == 'N')
    	    	    	     end = true;
    	    	    
    	    }while(!end);
    	    
    	    int d = InputDati.leggiIntero(INS_DURATA_FILM);
    	    int ap = InputDati.leggiIntero(INS_ANNOP_FILM, MIN_ANNOP, ANNO_CORRENTE);
    	    String cp = InputDati.leggiStringaNonVuota(INS_CASAPRO_FILM);
    	    String l = InputDati.leggiStringaNonVuota(INS_LINGUA_FILM);
    	    String g = InputDati.leggiStringaNonVuota(INS_GENERE_FILM);
    	    		
    	    Film fi = new Film(nf, t, r, p, s, i, d, ap, cp, l, g);
    	    
    	    return fi;
    }
	
}
