import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class TransactionClass {

	static final String DB_URL = "jdbc:mysql://10.72.3.168:3306/acp_sal";
	static final String JDBC = "com.mysql.jdbc.Driver";
	static final String USERNAME = "acp_user";
	static final String PASSWORD = "P9SyEqfT3crRahXx";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		Savepoint savepoint = null;

		try {

			Class.forName(JDBC);
			con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			stmt = con.createStatement();
			con.setAutoCommit(false);

			String sql = "Insert into Employee(empId,empName,salary,phoneNo,designation,age) values(616161,\"vishal sikka\",100000.0,\"996231179\",\"manager\",30)";
			int i = stmt.executeUpdate(sql);
			savepoint = con.setSavepoint();
			String sql2 = "Inserted into Employee(empId,empName,salary,phoneNo,designation,age) values(616163,\"vishal sikka\",100000.0,\"996231179\",\"manager\",30)";
			int j = stmt.executeUpdate(sql);
			System.out.println(i);
			// if (i!=1){
			// con.rollback(savepoint);
			// }
			con.commit();

		}

		catch (Exception e) {
			try {
				con.rollback(savepoint);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println(e.getMessage());
		}

	}
}
