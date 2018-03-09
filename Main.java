package it.ing.sw.v4.p4;

import java.io.File;
import java.util.Vector;

import it.ing.sw.*;
import it.ing.sw.v3.p1.AnagraficaFruitori;
import it.ing.sw.v3.p1.AnagraficaOperatori;
import it.ing.sw.v3.p1.Operatore;
import it.ing.sw.v3.p2.Archivio;
import it.ing.sw.v3.p2.Categoria;
import it.ing.sw.v3.p2.Libro;
import it.ing.sw.v3.p2.SottoCategoria;

public class Main 
{
	public static final String NOME_FILE = "gestoreRisorse.txt";								
	public static final String MSG_NO_CAST = "ATTENZIONE PROBLEMI CON IL CAST";			
	public static final String MSG_OK_FILE = "CARICAMENTO DA FILE EFFETTUATO";			
	public static final String MSG_NO_FILE = "CARICAMENTO DA FILE NON RIUSCITO. OCCORRE CREARE UNA NUOVA ANAGRAFICA DEI FRUITORI";			
	public static final String MSG_SALVA = "SALVATAGGIO DATI";
	public static final String ERRORE_CONVERSIONE_DATA = "Attenzione! Si e' verificato un errore di conversione della data";	
	
	/**
	 * Metodo per la creazione e l'aggiunta di 5 operatori preimpostati all'elenco degli operatori presente in AnagraficaOperatori
	 * 
	 * Pre : ao.elenco != null
	 * 
	 * @param ao : l'istanza della classe AnagraficaOperatore a cui aggiungere gli operatori
	 */
	public static void aggiuntaOperatoriPreimpostati(AnagraficaOperatori ao)
	{
		Operatore primo = new Operatore("Stefano", "Metelli", "ste", "161095");
		Operatore secondo = new Operatore("Alba", "Pasini", "sum56", "33alb33");
		Operatore terzo = new Operatore("Marco", "Bellini", "mark4", "starwars2");
		Operatore quarto = new Operatore("Fabio", "Piccinelli", "picci", "fighter118");
		Operatore quinto = new Operatore("Ottavia", "Lauretti", "oct4565", "ppla210");
		
		ao.getElenco().addElement(primo);
		ao.getElenco().addElement(secondo);
		ao.getElenco().addElement(terzo);
		ao.getElenco().addElement(quarto);
		ao.getElenco().addElement(quinto);
	}
	
	/**
	 * Metodo per la creazione della struttura base dell'archivio comprendente la categoria Libri
	 * 
	 * Pre: arc != null
	 * 
	 * @param arc: l'istanza della classe Archivio di cui creare la struttura
	 */
	public static void creaStrutturaArchivioLibri(Archivio arc)
	{
		final int DURATA_PRESTITO = 30;
		final int DURATA_PROROGA = 20;
		final int RICHIESTA_PROROGA = 10;
		final int MAX_PRESTITI = 3;

		Categoria c = new Categoria("Libri", DURATA_PRESTITO, DURATA_PROROGA, RICHIESTA_PROROGA, MAX_PRESTITI);
		arc.aggiungiCategoria(c);
	    c.inizializzaElencoSottoCategorie();
	    
	    SottoCategoria s1 = new SottoCategoria("Didattica");
	    SottoCategoria s2 = new SottoCategoria("Classici");
	    SottoCategoria s3 = new SottoCategoria("Fantasy");
	    SottoCategoria s4 = new SottoCategoria("Per ragazzi");
	    SottoCategoria s5 = new SottoCategoria("Gialli");

	    c.aggiungiSottoCategoria(s1);
	    c.aggiungiSottoCategoria(s2);
	    c.aggiungiSottoCategoria(s3);
	    c.aggiungiSottoCategoria(s4);
	    c.aggiungiSottoCategoria(s5);
	    
	    Vector <String> a1 = new Vector <String> ();
	    a1.add("Antoine de Saint_Exupéry");
	    Vector <String> a2 = new Vector <String> ();
	    a2.add("J.R.R. Tolkien");
	    Vector <String> a3 = new Vector <String> ();
	    a3.add("George Orwell");
	    Vector <String> a4 = new Vector <String> ();
	    a4.add("E.Gamma");
	    a4.add("R.Helm");
	    a4.add("R.Johnson");
	    a4.add("J.Vlissides");
	    
	    Libro l1 = new Libro(10, "Il piccolo principe", a1, 137, 2015, "Newton Compton", "italiano", "Per ragazzi");
	    Libro l2 = new Libro(5, "Il signore degli anelli", a2, 1264, 2017, "Bompiani", "italiano", "Fantasy");
	    Libro l3 = new Libro(8, "Animal Farm", a3, 112, 2008, "Penguin Books", "english", "Classici");
	    Libro l4 = new Libro(1, "Design Patterns", a4, 395, 2002, "Pearson", "italiano", "Didattica");
	    s1.aggiungiRisorsa(l4);
	    s2.aggiungiRisorsa(l3);
	    s3.aggiungiRisorsa(l2);
	    s4.aggiungiRisorsa(l1);
	}
	
	/**
	 * Metodo per la creazione della struttura base dell'archivio
	 * 
	 * Pre: arc != null
	 * 
	 * @param arc: l'istanza della classe Archivio di cui creare la struttura
	 */
	public static void creaStrutturaArchivioFilm(Archivio arc)
	{
		final int DURATA_PRESTITO = 15;
		final int DURATA_PROROGA = 10;
		final int RICHIESTA_PROROGA = 5;
		final int MAX_PRESTITI = 5;

		Categoria c = new Categoria("Film", DURATA_PRESTITO, DURATA_PROROGA, RICHIESTA_PROROGA, MAX_PRESTITI);
		arc.aggiungiCategoria(c);
	    c.inizializzaElencoSottoCategorie();
	    
	    SottoCategoria s1 = new SottoCategoria("Avventura");
	    SottoCategoria s2 = new SottoCategoria("Fantascienza");
	    SottoCategoria s3 = new SottoCategoria("Horror");
	    SottoCategoria s4 = new SottoCategoria("Commedia");
	    SottoCategoria s5 = new SottoCategoria("Documentario");

	    c.aggiungiSottoCategoria(s1);
	    c.aggiungiSottoCategoria(s2);
	    c.aggiungiSottoCategoria(s3);
	    c.aggiungiSottoCategoria(s4);
	    c.aggiungiSottoCategoria(s5);
	    
	    Vector <String> a1 = new Vector <String> ();
	    a1.add("");
	    Vector <String> a2 = new Vector <String> ();
	    a2.add("J.R.R. Tolkien");
	    Vector <String> a3 = new Vector <String> ();
	    a3.add("George Orwell");
	    Vector <String> a4 = new Vector <String> ();
	    a4.add("E.Gamma");
	    a4.add("R.Helm");
	    a4.add("R.Johnson");
	    a4.add("J.Vlissides");
	    
	    Libro l1 = new Libro(10, "Il piccolo principe", a1, 137, 2015, "Newton Compton", "italiano", "Per ragazzi");
	    Libro l2 = new Libro(5, "Il signore degli anelli", a2, 1264, 2017, "Bompiani", "italiano", "Fantasy");
	    Libro l3 = new Libro(8, "Animal Farm", a3, 112, 2008, "Penguin Books", "english", "Classici");
	    Libro l4 = new Libro(1, "Design Patterns", a4, 395, 2002, "Pearson", "italiano", "Didattica");
	    s1.aggiungiRisorsa(l4);
	    s2.aggiungiRisorsa(l3);
	    s3.aggiungiRisorsa(l2);
	    s4.aggiungiRisorsa(l1);
	}
	
	/**
	 * Metodo main per l'esecuzione del software
	 * @param args
	 */
	public static void main(String[] args) 
	{
        File gestoreRisorse = new File(NOME_FILE);
        
        RaccoltaDati rd = null;
        AnagraficaFruitori af = null;
        AnagraficaOperatori ao = null;
        Archivio arc = null;
        ArchivioPrestiti ap = null;

        boolean caricamentoRiuscito = false;
		
		/**
		 * Tale istruzione verifica se il file in questione esiste all'interno del sistema di memorizzazione locale.
		 * In questo caso vengono estrapolate sia la RaccoltaDati sia l'AnagraficaFruitori, l'AnagraficaOperatori e l'Archivio, venendo salvati nelle variabili opportune.
		 * Le probabili eccezioni vengono gestite secondo la modalità piu' adatta al tipo di eccezione ed infine viene mostrato un messaggio di conferma se il caricamento da file gia' esistente si e' concluso con successo
		 */
		if (gestoreRisorse.exists())
		{
			/**
			 * Si cercano di reperire le istanze delle classi AnagraficaFruitori, AnagraficaOperatori e Archivio salvate su file. 
			 * Vengono inoltre opportunamente gestite le eccezioni di tipo ClassCast e NullPointer.
			 * Infine, nel caso in cui le istanze siano state correttamente inizializzate, viene mostrato a video un messaggio di conferma
			 * modificando al contempo una specifica variabile booleana per la segnalazione dell'avvenuto caricamento
			 */
			try 
			{
				rd = (RaccoltaDati)ServizioFile.caricaSingoloOggetto(gestoreRisorse);
				af = rd.getAnagraficaFruitori();
				ao = rd.getAnagraficaOperatori();
				arc = rd.getArchivio();
				ap = rd.getArchivioPrestiti();
			}
			catch (ClassCastException e)
			{
				System.out.println(MSG_NO_CAST);
			}
			catch(NullPointerException a)
			{
				System.out.println();
			}
			finally
			{
				if (af != null && ao != null && arc != null && ap != null)
				{
					System.out.println(MSG_OK_FILE);
					caricamentoRiuscito = true;
				}
			}		
		}
		
		/**
		 * Nel caso in cui il caricamento da file non sia andato a buon fine si provvedono a costruire ex novo le strutture dati richieste e a caricare i dati preimpostati degli operatori
		 */
		if (!caricamentoRiuscito)				
		{
			System.out.println(MSG_NO_FILE);				
			af = new AnagraficaFruitori();
			ao = new AnagraficaOperatori();
			arc = new Archivio();
			ap = new ArchivioPrestiti();
			
			aggiuntaOperatoriPreimpostati(ao);
			creaStrutturaArchivio(arc);
		}
		
		/**
		 * Viene costruito un nuovo gestore menu' che possa dare avvio alla logica del sistema applicativo 
		 */
		GestoreMenu g = new GestoreMenu();
		g.logicaMenu(af, ao, arc, ap);
		
		/**
		 * L'operazione di salvataggio prevede la costruzione di una nuova RaccoltaDati attraverso i parametri AnagraficaFruitori, AnagraficaOperatori e Archivio e l'aggiornamento del file in gestoreRisorse
		 */
		System.out.println(MSG_SALVA);
		rd = new RaccoltaDati(af, ao, arc, ap);
	    ServizioFile.salvaSingoloOggetto(gestoreRisorse, rd);	
	}
	
}
