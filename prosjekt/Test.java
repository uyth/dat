package treningsdagbok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Test {
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	//mysql.stud.ntnu.no
	//127.0.0.1
	public void connect() {
		try  {
			conn = DriverManager.getConnection("jdbc:mysql://mysql.stud.ntnu.no/uyth_treningsdagbok?useSSL=false&user=tdvo&password=root");
		}
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
		}
	}
	
	public void find() {
		try {
			stmt = conn.createStatement();
			String query = "SELECT * FROM TRENING";
			if (stmt.execute(query)) {
				rs = stmt.getResultSet();
			}
			while (rs.next()) {
				String col1 = rs.getString(1);
				String col2 = rs.getString(2);
				System.out.println(col1 + " - " + col2);
			}
		}
		catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
		}
	}

    public static void main(String[] args) {
    	Test t = new Test();
    	t.connect();
    	t.find();
	}
    
}