import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;


public class JavaJBBC 
{
	static final String JBDC="com.mysql.jdbc.Driver";
	static final String DB_URL="jdbc:mysql://10.72.3.168:3306/acp_sal";
	static final String USERNAME="acp_user";
	static final String PASSWORD="P9SyEqfT3crRahXx";
	
	public static void main(String[] args) {
		
	Connection con=null;
	Statement stmt=null;
	
	try{
	
	//STEP 2: Register JDBC driver	
	Class.forName(JBDC);
	
	//STEP 3: Open a connection
	con=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
	
	stmt=con.createStatement();
	String sql="Select salary,designation from Employee where empId=665808";
	ResultSet rs=stmt.executeQuery(sql);
	
	while(rs.next()){
		double salary=rs.getDouble("salary");
		String designation=rs.getString("designation");
		System.out.println(salary);
		System.out.println(designation);
	}
	
	con.close();
	stmt.close();
	
	}
	
	catch(Exception e)
	{
		System.out.println("Hiiiiiiiiiiiiiiiii");
		System.out.println(e.getMessage());
	}
		
		
	}
	
	

}
