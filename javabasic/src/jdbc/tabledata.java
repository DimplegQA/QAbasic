package jdbc;
import java.sql.*;

public class tabledata {
	    public static void main(String[] args) throws SQLException, ClassNotFoundException {
	        	            // Load the JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            // Establish connection
	          //  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/partydata","Dimple","dimple");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/partydata", "root", "dimple");
	            // Create a statement
	            Statement st = con.createStatement();				
	            // Execute a query
	            ResultSet rs = st.executeQuery("select * from customer");
	            while(rs.next()) {
String data1 = rs.getString("username");
String data2 = rs.getString("password");
String data3 = rs.getString("firstname");
String data4 = rs.getString("lastname");//Process the result set
System.out.println(data1+" "+data2+" "+data3+" "+data4);}
st.close();
con.close();
	    }}