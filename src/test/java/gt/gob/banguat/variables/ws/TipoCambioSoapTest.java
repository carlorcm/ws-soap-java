package gt.gob.banguat.variables.ws;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class TipoCambioSoapTest {

	@Test
	public void testVariablesDisponibles() {
		TipoCambioSoap servicio = new TipoCambio().getTipoCambioSoap();
		int tm = servicio.variablesDisponibles().getTotalItems();
		
		for (Variable array : servicio.variablesDisponibles().getVariables().variable) {
			if (array.moneda % 2 == 0) {
				System.out.println("Codigo de Moneda: "+array.moneda+" Nombre de la moneda: "+array.descripcion);
		    } 
			
		}				
	}

}
