package interazione_4;

import java.io.Serializable;

import logica_4.*;

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
    * @pre: (af != null) && (ao != null) && (arc != null) && (ap != null)
    * 
    * @param af: anagrafica fruitori
    * @param ao: anagrafica operatori
    * @param arc: archivio risorse
    * @param ap: archivio prestiti
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
     * @return i vari attributi della classe RaccoltaDati
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
