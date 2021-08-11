package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcresult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/telstra";
 	   String username = "root";
 	   String password = "shristi";
 	  // String updateCommand = "UPDATE employee SET designation='Sr Manager' WHERE empid=8091";
 	   String result = "SELECT * FROM employee";
 	   ResultSet i=null;
 	   
 	   Connection cn = null;
 	   Statement st = null;
 	   
 	   
 	   try {
 		   cn = DriverManager.getConnection(url,username,password);
 	       st = cn.createStatement();
 	       i = st.executeQuery(result);
 	      // System.out.println(i+" Records added...");
 	       while(i.next())
 	       {
 	    	   int empid = i.getInt("empid");
 	    	   String empname = i.getString("empname");
 	    	   String designation = i.getString("designation");
 	    	   System.out.println(empid+" "+empname+" "+designation);
 	       }
 	   }
 	   catch(SQLException e){
 		   e.printStackTrace();   
 	   }

	}

}
