package com.sakaiwebservicesoap.modelo;

import java.sql.Connection;
import java.sql.DriverManager;



public class webservicesakai_JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	
		String jdbcUrl="jdbc:mysql://localhost:3308/webservicesakai?useSSl=false";
		String usuario="root";
		String contra="";
		
		
		
		try {
			
			
			System.out.println("Intentando conectarcon la BBDD" +jdbcUrl);
			Connection miConexion=(Connection) DriverManager.getConnection(jdbcUrl,  usuario, contra);
			System.out.println("Conexion Exitosa !!");
			
		} catch (Exception e) {
			// TODO: handle exception
			
			
			e.printStackTrace();
		}
	
}
	

}
