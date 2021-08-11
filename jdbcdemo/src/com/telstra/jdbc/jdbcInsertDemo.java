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
    	   String deleteCommand = "DELETE FROM employee WHERE empid=101;";
    	  //   String insertCommand = "INSERT INTO employee VALUES(101,'Abhi','Content Writer')";
    	  // String updateCommand = "UPDATE employee SET designation='Sr Manager' WHERE empid=8091";
    	   int i=0;
    	   
    	   Connection cn = null;
    	   Statement st = null;
    	   
    	   
    	   try {
    		   cn = DriverManager.getConnection(url,username,password);
    	       st = cn.createStatement();
    	       i=st.executeUpdate(deleteCommand);
    	  //     i = st.executeUpdate(insertCommand);
 //   	       i = st.executeUpdate(updateCommand);
    	       System.out.println(i+" Records added...");
    	   }
    	   catch(SQLException e){
    		   e.printStackTrace();   
    	   }
       }
}
