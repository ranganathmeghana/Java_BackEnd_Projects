import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DatabaseClass {

	public static void main(String[] args) 
	
	{
		try {
	        Class.forName("org.hsqldb.jdbcDriver" );
//	        Connection c = DriverManager.getConnection("jdbc:hsqldb:hsql:file//localhost/xdb", "sa", "");
	        Connection c = DriverManager.getConnection("jdbc:hsqldb:file:SqlClass", "sa", "");		
System.out.println("Connection made");
	        Statement st= c.createStatement();
	        ResultSet resultSet=st.executeQuery("select * from Employee");
	        System.out.println(resultSet);
//	        Boolean b=st.execute(s)

	    } catch (Exception e) {
	        System.out.println("ERROR: failed to load HSQLDB JDBC driver.");
	        e.printStackTrace();
	        return;
	    }
 
	   
	}

}
