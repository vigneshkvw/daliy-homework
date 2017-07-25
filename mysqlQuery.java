/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hackers;

;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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
       
           {
try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
      
      try {
         Connection conn1 = (Connection) DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Banking?useSSL=false","root", "viki");

           Statement stmt1 = (Statement) conn1.createStatement();
         ResultSet rs = stmt1.executeQuery("SELECT * FROM logbook where accountnumber = '+ AccNo'");
          System.out.println("accountnumber\t\tname\t\taddress\t\tstate\t\tcity \t\tpincode\t\tcashdeposit\t\tbalance");
 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
             while (rs.next()) {
                int id = rs.getInt("accountnumber");
            String name = rs.getString("name");
             String address = rs.getString("address");
              String state = rs.getString("state");
            String city = rs.getString("city");
            int pincode = rs.getInt("pincode");
            int cashdeposit = rs.getInt("cashdeposit");
            int balance = rs.getInt("balance");
            System.out.println();
             }
             
             
             conn1.close();
      }
            catch (SQLException ex) {
                System.out.println("error");
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
         Connection connn = (Connection) DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Banking?useSSL=false","root", "viki");

         Statement stmt1 = (Statement) connn.createStatement();
         ResultSet rs = stmt1.executeQuery("SELECT * FROM logbook");
         System.out.println("accountnumber\t\tname\t\taddress\t\tstate\t\tcity \t\tpincode\t\tcashdeposit\t\tbalance");
 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         while (rs.next()) {
             System.out.print(rs.getInt("accountnumber")+"\t\t");
          System.out.print(rs.getString("name")+"\t\t");
         System.out.print(rs.getString("address")+"\t\t");
             System.out.print(rs.getString("state")+"\t\t");
              System.out.print(rs.getString("city")+"\t\t");
            System.out.print(rs.getInt("pincode")+"\t\t");
         System.out.print(rs.getInt("cashdeposit")+"\t\t");
             System.out.print(rs.getInt("balance")+"\t\t");;
            System.out.println();
         }
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
   }
}
}
