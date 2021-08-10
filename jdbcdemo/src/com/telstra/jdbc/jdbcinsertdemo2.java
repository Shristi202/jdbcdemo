package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcinsertdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/telstra";
 	   String username = "root";
 	   String password = "shristi";
 	   String insertCommand = "INSERT INTO product VALUES(1,'Chai','Beverages')";
 	   int i=0;
 	   
 	   Connection cn = null;
 	   Statement st = null;
 	   
 	   
 	   try {
 		   cn = DriverManager.getConnection(url,username,password);
 	       st = cn.createStatement();
 	       i = st.executeUpdate(insertCommand);
 	       System.out.println(i+" Records added...");
 	   }
 	   catch(SQLException e){
 		   e.printStackTrace();   
 	   }

	}

}
