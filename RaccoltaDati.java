package it.ing.sw.v4.p4;

import java.io.Serializable;

import it.ing.sw.v4.p1.AnagraficaFruitori;
import it.ing.sw.v4.p1.AnagraficaOperatori;
import it.ing.sw.v4.p2.Archivio;
import it.ing.sw.v4.p3.ArchivioPrestiti;

/**
 * Questa classe rappresenta un raccoglitore di dati, utile per la memorizzazione su file
 */
public class RaccoltaDati implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private AnagraficaFruitori af;
    private AnagraficaOperatori ao;
    private Archivio arc;
    private ArchivioPrestiti ap;
    
    /**
    * Metodo costruttore della classe RaccoltaDati
    * 
    * Pre : af != null
    * Pre : ao != null
    * Pre: arc != null
    * Pre: ap != null
    * 
    * @param af: anagrafica fruitori
    * @param ao: anagrafica operatori
    * @param arc: archivio risorse
    * @param ao: archivio prestiti
     */
    public RaccoltaDati(AnagraficaFruitori af, AnagraficaOperatori ao, Archivio arc, ArchivioPrestiti ap)
    {
    	   this.af = af;
    	   this.ao = ao;
    	   this.arc = arc;
    	   this.ap = ap;
    }
    
    /**
     * Metodi get della classe RaccoltaDati
     */
    public AnagraficaFruitori getAnagraficaFruitori()
	{
		return af;
	}
    
    public AnagraficaOperatori getAnagraficaOperatori()
	{
		return ao;
	}
    
    public Archivio getArchivio()
   	{
   		return arc;
   	}
    
    public ArchivioPrestiti getArchivioPrestiti()
   	{
   		return ap;
   	}
    
}
