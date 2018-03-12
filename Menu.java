package it.ing.sw.v4.p1;

import java.io.Serializable;

import it.ing.sw.InputDati;

/**
 * Questa classe rappresenta il modello di un Menu'
 */
public class Menu implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String CORNICE = "*************************************************************";
	public static final String RICHIESTA_INSERIMENTO = "Digita il numero dell'opzione desiderata: ";
	   
	private String titolo;
	private String [] voci;
	   
	/**
	 * Metodo costruttore della classe menu'
	 * 
	 * Pre : titolo != ""
	 * Pre : voci != null
	 * 
	 * @param titolo : titolo del menu'
	 * @param voci : voci del menu'
	 */
	public Menu(String titolo, String [] voci)
	{
		this.titolo  = titolo;
		this.voci = voci;
	}
	   
    /**
     * Richiama il metodo stampa() per la visualizzazione del menu' e prende in input l'opzione digitata dall'utente.
     * @return il numero corrispondente all'opzione digitata dall'utente
     */
	public int scegli()
    {
		stampa();
 	   	int opzione = InputDati.leggiIntero(RICHIESTA_INSERIMENTO, 0, voci.length);
		   
 	   	return opzione;
	}
	   
	/**
	 * Mostra a video il menu'
	 */
	public void stampa()
	{
		System.out.println(CORNICE);
		System.out.println(titolo);
		System.out.println(CORNICE);
		   
		for(int i = 0; i < voci.length; i++)
		{
			System.out.println( (i+1) + "-" + voci[i]);
		}
		   
		System.out.println();
	}
	   
}