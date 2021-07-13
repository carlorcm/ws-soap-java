
package gt.gob.banguat.variables.ws;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TipoCambioSoap", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TipoCambioSoap {


    /**
     * Despliega las variables (con relación a la moneda) disponibles para consulta.
     * 
     * @return
     *     returns gt.gob.banguat.variables.ws.InfoVariable
     */
    @WebMethod(operationName = "VariablesDisponibles", action = "http://www.banguat.gob.gt/variables/ws/VariablesDisponibles")
    @WebResult(name = "VariablesDisponiblesResult", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
    @RequestWrapper(localName = "VariablesDisponibles", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.VariablesDisponibles")
    @ResponseWrapper(localName = "VariablesDisponiblesResponse", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.VariablesDisponiblesResponse")
    public InfoVariable variablesDisponibles();

    /**
     * Despliega el tipo de cambio correspondiente a una variable (moneda) dada. (Formato: moneda=2) 
     * 
     * @param variable
     * @return
     *     returns gt.gob.banguat.variables.ws.InfoVariable
     */
    @WebMethod(operationName = "Variables", action = "http://www.banguat.gob.gt/variables/ws/Variables")
    @WebResult(name = "VariablesResult", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
    @RequestWrapper(localName = "Variables", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.Variables")
    @ResponseWrapper(localName = "VariablesResponse", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.VariablesResponse")
    public InfoVariable variables(
        @WebParam(name = "variable", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
        int variable);

    /**
     * Despliega la información del tipo de cambio, en dólares, desde una fecha dada hasta el día corriente. (Formato: fecha_ini=dd/mm/aaaa).
     * 
     * @param fechainit
     * @return
     *     returns gt.gob.banguat.variables.ws.DataVariable
     */
    @WebMethod(operationName = "TipoCambioFechaInicial", action = "http://www.banguat.gob.gt/variables/ws/TipoCambioFechaInicial")
    @WebResult(name = "TipoCambioFechaInicialResult", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
    @RequestWrapper(localName = "TipoCambioFechaInicial", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.TipoCambioFechaInicial")
    @ResponseWrapper(localName = "TipoCambioFechaInicialResponse", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.TipoCambioFechaInicialResponse")
    public DataVariable tipoCambioFechaInicial(
        @WebParam(name = "fechainit", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
        String fechainit);

    /**
     * Despliega la información para dólares en el período de tiempo dado. (Formato: fecha_ini=dd/mm/aaaa fecha_fin=dd/mm/aaaa)
     * 
     * @param fechainit
     * @param fechafin
     * @return
     *     returns gt.gob.banguat.variables.ws.DataVariable
     */
    @WebMethod(operationName = "TipoCambioRango", action = "http://www.banguat.gob.gt/variables/ws/TipoCambioRango")
    @WebResult(name = "TipoCambioRangoResult", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
    @RequestWrapper(localName = "TipoCambioRango", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.TipoCambioRango")
    @ResponseWrapper(localName = "TipoCambioRangoResponse", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.TipoCambioRangoResponse")
    public DataVariable tipoCambioRango(
        @WebParam(name = "fechainit", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
        String fechainit,
        @WebParam(name = "fechafin", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
        String fechafin);

    /**
     * Despliega la información para la variable indicada a partir de una fecha y moneda indicada. (Formato: fecha_ini=dd/mm/aaaa moneda=02).
     * 
     * @param fechainit
     * @param moneda
     * @return
     *     returns gt.gob.banguat.variables.ws.DataVariable
     */
    @WebMethod(operationName = "TipoCambioFechaInicialMoneda", action = "http://www.banguat.gob.gt/variables/ws/TipoCambioFechaInicialMoneda")
    @WebResult(name = "TipoCambioFechaInicialMonedaResult", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
    @RequestWrapper(localName = "TipoCambioFechaInicialMoneda", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.TipoCambioFechaInicialMoneda")
    @ResponseWrapper(localName = "TipoCambioFechaInicialMonedaResponse", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.TipoCambioFechaInicialMonedaResponse")
    public DataVariable tipoCambioFechaInicialMoneda(
        @WebParam(name = "fechainit", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
        String fechainit,
        @WebParam(name = "moneda", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
        int moneda);

    /**
     * Despliega la información para la variable indicada en el período de tiempo y la moneda dada. (Formato: fecha_ini=dd/mm/aaaa fecha_fin=dd/mm/aaaa moneda=02)
     * 
     * @param fechainit
     * @param moneda
     * @param fechafin
     * @return
     *     returns gt.gob.banguat.variables.ws.DataVariable
     */
    @WebMethod(operationName = "TipoCambioRangoMoneda", action = "http://www.banguat.gob.gt/variables/ws/TipoCambioRangoMoneda")
    @WebResult(name = "TipoCambioRangoMonedaResult", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
    @RequestWrapper(localName = "TipoCambioRangoMoneda", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.TipoCambioRangoMoneda")
    @ResponseWrapper(localName = "TipoCambioRangoMonedaResponse", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.TipoCambioRangoMonedaResponse")
    public DataVariable tipoCambioRangoMoneda(
        @WebParam(name = "fechainit", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
        String fechainit,
        @WebParam(name = "fechafin", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
        String fechafin,
        @WebParam(name = "moneda", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
        int moneda);

    /**
     * Devuelve el cambio del día en dólares
     * 
     * @return
     *     returns gt.gob.banguat.variables.ws.InfoVariable
     */
    @WebMethod(operationName = "TipoCambioDia", action = "http://www.banguat.gob.gt/variables/ws/TipoCambioDia")
    @WebResult(name = "TipoCambioDiaResult", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
    @RequestWrapper(localName = "TipoCambioDia", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.TipoCambioDia")
    @ResponseWrapper(localName = "TipoCambioDiaResponse", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.TipoCambioDiaResponse")
    public InfoVariable tipoCambioDia();

    /**
     * Devuelve el cambio del día en dólares
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "TipoCambioDiaString", action = "http://www.banguat.gob.gt/variables/ws/TipoCambioDiaString")
    @WebResult(name = "TipoCambioDiaStringResult", targetNamespace = "http://www.banguat.gob.gt/variables/ws/")
    @RequestWrapper(localName = "TipoCambioDiaString", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.TipoCambioDiaString")
    @ResponseWrapper(localName = "TipoCambioDiaStringResponse", targetNamespace = "http://www.banguat.gob.gt/variables/ws/", className = "gt.gob.banguat.variables.ws.TipoCambioDiaStringResponse")
    public String tipoCambioDiaString();

}
