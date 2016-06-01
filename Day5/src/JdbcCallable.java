import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.CallableStatement;


public class JdbcCallable 
{
 
	public void getEmpName()
	{
		Connection con=null;
		CallableStatement st=null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://10.72.3.168:3306/acp_practice";
			String username="acp_user";
			String password="P9SyEqfT3crRahXx";
			con=DriverManager.getConnection(url, username, password);
			String query="call getEmpName1 (?,?)";
			st=con.prepareCall(query);
			int empid=665808;
			st.setInt(1, empid);
			st.registerOutParameter(2,  java.sql.Types.VARCHAR);
		st.execute();
		String name=st.getString(2);
		System.out.println("name is "+name);
			
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public void insert()
	{
		
			Connection con=null;
			CallableStatement st=null;

			try{
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://10.72.3.168:3306/acp_practice";
				String username="acp_user";
				String password="P9SyEqfT3crRahXx";
				
				con=DriverManager.getConnection(url, username, password);
			String query="call InsertValues1 (?,?)";
			st=con.prepareCall(query);
			st.setInt(1, 611622);
			st.setString(2, "Suraj");
			st.execute();
			if(st.execute()==true)
				System.out.println("done");
				
		}
		
		catch(Exception e)
		{ 
			System.out.println("hi");
			System.out.println(e.getMessage());
		}
	}
	
	
public static void main(String[] args)
{

JdbcCallable j=new JdbcCallable();
j.getEmpName();
j.insert();

	}

	
	
}
