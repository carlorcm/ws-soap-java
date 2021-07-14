package gt.gob.banguat.variables.ws.pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import gt.gob.banguat.variables.ws.TipoCambio;
import gt.gob.banguat.variables.ws.TipoCambioSoap;
import gt.gob.banguat.variables.ws.Variable;

public class consumeInsert {
	
	public static void main(String[] args) throws Exception {
	    //testVariablesDisponibles();
		createTable();
	  }
	
	public static void testVariablesDisponibles() {
		TipoCambioSoap servicio = new TipoCambio().getTipoCambioSoap();
		//int tm = servicio.variablesDisponibles().getTotalItems();
		
		for (Variable array : servicio.variablesDisponibles().getVariables().getVariable()) {
			if (array.getMoneda() % 2 == 0) {
				System.out.println("Codigo de Moneda: "+array.getMoneda()+" Nombre de la moneda: "+array.getDescripcion());
		    } 
			
		}				
	}
	
	public static void createTable() throws Exception {
		
		try {
			
			Connection conn = getConnection();
			PreparedStatement create = conn.prepareStatement("CREATE TABLE IF NOT EXISTS cat_moneda(id int NOT NULL AUTO_INCREMENT,id_moneda int, descripcion_moneda varchar(200),PRIMARY KEY(id))");
			create.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally{System.out.println("Function CREATE completed");};
		
	}
	
	public static Connection getConnection() throws Exception {
		
		try {
			
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://127.0.0.1:3306/pronet";
			String username = "root";
			String password = "Campos1100#";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected to the database...");
			return conn;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
		
	}

}
