package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcInsertDemo {
       public static void main(String args[])
       {
//    	   try {
//    		   Class.forName("com.mysql.jdbc.Driver");
//    	   }
    	   String url="jdbc:mysql://localhost:3306/telstra";
    	   String username = "root";
    	   String password = "shristi";
    	   String insertCommand = "INSERT INTO employee VALUES(8091,'SHRI','STUDENT')";
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
