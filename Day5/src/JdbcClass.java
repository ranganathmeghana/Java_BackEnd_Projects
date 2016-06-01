import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;


public class JdbcClass {
	

	public boolean insertUser(User obj)
	{
		Connection con=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		boolean b=false;

		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionUrl="jdbc:mysql://10.72.3.168:3306/acp_practice";
			String connectionuserName="acp_user";
			String connectionpass="P9SyEqfT3crRahXx";
			
			con=DriverManager.getConnection(connectionUrl, connectionuserName, connectionpass);
			String query="insert into UserTable(ID, firstname, lastname) values(?, ?, ?)";
			
			st=con.prepareStatement(query);
			st.setInt(1,obj.getID());
			st.setString(2, obj.getFname());
			st.setString(3, obj.getLname());
			b=st.execute();
		
		
		}
			
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return b;
	}

	public void retrieve(User obj)
	{
		
Connection con=null;
Statement st=null;
ResultSet rs=null;

try{
	Class.forName("com.mysql.jdbc.Driver").newInstance();
	String connectionUrl="jdbc:mysql://10.72.3.168:3306/acp_practice";
	String connectionuserName="acp_user";
	String connectionpass="P9SyEqfT3crRahXx";
	
	con=DriverManager.getConnection(connectionUrl, connectionuserName, connectionpass);
	st=con.createStatement();
	rs=st.executeQuery("select *from UserTable");
	while(rs.next()!=false)
	{
		
		String id=rs.getString(obj.getID());
		String fname=rs.getString(obj.getFname());
		String lname=rs.getString(obj.getLname());
		
		System.out.println(id);
		System.out.println(fname);
		System.out.println(lname);
	}
}

	catch(Exception e)
	{
	System.out.println(e.getMessage());
	}

	
}

public static void main(String args[])
{
	User obj=new User();
	Scanner s1=new Scanner(System.in);
	System.out.println("enter first name");
	obj.setFname(s1.next());
	Scanner s2=new Scanner(System.in);
	System.out.println("enter last name");
	obj.setLname(s2.next());
	Scanner s3=new Scanner(System.in);
	System.out.println("enter ID");
	obj.setID(Integer.parseInt(s3.next()));
	
	
	
}


}


