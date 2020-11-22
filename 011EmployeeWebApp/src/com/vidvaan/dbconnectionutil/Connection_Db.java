package com.vidvaan.dbconnectionutil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import com.vidvaan.dbproperites.*;

public class Connection_Db {
	
	static Connection connection = null;
	static Properties properties=null;
	
	static {
		
		properties = new Properties();
		try {
			properties.load(Connection_Db.class.getClassLoader()
					.getResourceAsStream("com/vidvaan/dbproperites/db.properties"));
			Class.forName(properties.getProperty("oracleDriver"));
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			}
	public static Connection getConnection() {
		
		try {
			connection=DriverManager.getConnection(properties.getProperty("oracleUrl"),properties.getProperty("oracleUsername"),
					properties.getProperty("oraclePWD"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
		
		
		
	}
	public static void closeConnection(Connection con) {
		
	if(con!=null) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
	public static void closeStatement(Statement st) {
		if(st!=null) {
			try {
				st.close();
				Connection_Db.closeConnection(connection);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
	
	

}
