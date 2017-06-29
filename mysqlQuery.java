/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author viki
 */
public class mysqlQuery {
    public static int accountnumber;
    private static Object con;
    private static Object stmt;
    private static Object conn;
   
  


	public static void main(String arg[])  {
		Scanner in = new Scanner(System.in);
              System.out.println("1.show tables. 2.slectrow");

              int ch = in.nextInt();
				switch (ch) {

               case 1:
                          showTable();
                          break;

                           case 2:
                          selectrow();
                          break;
}
    }

    private static void getconnection() {
     System.out.println("-------- MySQL JDBC Connection Testing ------------");

	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}

	System.out.println("MySQL JDBC Driver Registered!");
	Connection connection = null;

	try {
		connection = (Connection) DriverManager
		.getConnection("jdbc:mysql://localhost:3306/Banking?useSSL=false","root", "viki");

	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return;
	}

	if (connection != null) {
		System.out.println("You made it, take control your database now!");
	} else {
		System.out.println("Failed to make connection!");
	}
  }

    private static void selectrow() {
      
         Scanner in = new Scanner(System.in);
         System.out.println("Enter your accont number");
       int AccNo = in.nextInt();
        System.out.println("Enter your accont number");
       Float Deposit = in.nextFloat();
           {
try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
      
      try {
         Connection conn = (Connection) DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Banking?useSSL=false","root", "viki");

         Statement stmt1 = (Statement) conn.createStatement();
         String query = "update users set accountnumber = ? where cashdeposit = ?";
          PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
             preparedStmt.setInt   (1, AccNo);
             preparedStmt.setFloat   (2, Deposit);
             preparedStmt.executeUpdate();
             conn.close();
      }
            catch (SQLException ex) {
                Logger.getLogger(mysqlQuery.class.getName()).log(Level.SEVERE, null, ex);
            }           }

    }

    private static void showTable() {
    {
try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
      
      try {
         Connection con = (Connection) DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Banking?useSSL=false","root", "viki");

         Statement stmt = (Statement) con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM logbook");
         System.out.println("accountnumber  name   address  state  city   pincode   cashdeposit   balance");

         while (rs.next()) {
            int id = rs.getInt("accountnumber");
            String name = rs.getString("name");
             String address = rs.getString("address");
              String state = rs.getString("state");
            String city = rs.getString("city");
            int pincode = rs.getInt("pincode");
            int cashdeposit = rs.getInt("cashdeposit");
            int balance = rs.getInt("balance");  
            System.out.println(accountnumber+"   "+name+"    "+address+"   "+state+"   "+city+"   "+pincode+"   "+cashdeposit+"   "+balance);
         }
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
   }
}
}
