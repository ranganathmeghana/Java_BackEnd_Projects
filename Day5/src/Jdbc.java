
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;


public class Jdbc {
	

	public int insertUser(User obj)
	{
		Connection con=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		int b=0;

		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionUrl="jdbc:mysql://10.72.3.168:3306/acp_practice";
			String connectionuserName="acp_user";
			String connectionpass="P9SyEqfT3crRahXx";
			
			con=DriverManager.getConnection(connectionUrl, connectionuserName, connectionpass);
			String query="insert into UserTableMeg1(ID, firstname, lastname) values(?, ?, ?)";
			
			st=con.prepareStatement(query);
			st.setInt(1,obj.getID());
			st.setString(2, obj.getFname());
			st.setString(3, obj.getLname());
			b=st.executeUpdate();
		
		}
			
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
//		if(b!=0){
//		System.out.println("Inserted");
//		System.out.println(b);}
		return b;
		
	}

	public void retrieve(User obj)
	{
		
Connection con=null;
Statement st=null;
ResultSet rs=null;


try{
	//System.out.println("before");
	Class.forName("com.mysql.jdbc.Driver");
	//System.out.println("after");
	String connectionUrl="jdbc:mysql://10.72.3.168:3306/acp_practice";
	String connectionuserName="acp_user";
	String connectionpass="P9SyEqfT3crRahXx";
	
	con=DriverManager.getConnection(connectionUrl, connectionuserName, connectionpass);
	st=con.createStatement();
	rs=st.executeQuery("select *from UserTableMeg1");
	//System.out.println(rs.getArray("firstname"));
	while(rs.next()!=false)
	{
		
		String id=rs.getNString("ID");
		String fname=rs.getString("firstname");
		String lname=rs.getString("lastname");
		
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
	
	Jdbc jobj=new Jdbc();
	jobj.insertUser(obj);
	jobj.retrieve(obj);
	
	
	
}


}


