package gt.gob.banguat.variables.ws.pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import gt.gob.banguat.variables.ws.TipoCambio;
import gt.gob.banguat.variables.ws.TipoCambioSoap;
import gt.gob.banguat.variables.ws.Var;
import gt.gob.banguat.variables.ws.Variable;


public class consumeInsert {
	
	public static void main(String[] args) throws Exception {	    
		createTable();
		testVariablesDisponibles();
	  }
	
	public static void insert(int var1in,String var2in) throws Exception{
		final int var1 = var1in;
		final String var2 = var2in;
		try {
			Connection conn = getConnection();
			PreparedStatement posted = conn.prepareStatement("INSERT INTO cat_moneda (id_moneda,descripcion_moneda) VALUES('"+var1+"','"+var2+"')");
			posted.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static void testVariablesDisponibles() {
		
		TipoCambioSoap servicio = new TipoCambio().getTipoCambioSoap();
		//int tm = servicio.variablesDisponibles().getTotalItems();
		
		for (Variable array : servicio.variablesDisponibles().getVariables().getVariable()) {
			if (array.getMoneda() % 2 == 0) {
				try {
					insert(array.getMoneda(),array.getDescripcion());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Codigo de Moneda: "+array.getMoneda()+" Nombre de la moneda: "+array.getDescripcion());
		    } 
			
		}				
	}
	
	public static void tipoCambioRango() {
		TipoCambioSoap servicio = new TipoCambio().getTipoCambioSoap();
		for (Var array : servicio.tipoCambioRango("30/07/2020", "31/07/2020").getVars().getVar()) {
			System.out.println(array.getFecha()+" "+array.getMoneda()+" Compra: "+array.getCompra()+" Venta: "+array.getVenta());
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
			return conn;
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
		
	}

}
