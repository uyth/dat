package treningsdagbok;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Logger;
import com.jcraft.jsch.Session;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class Test {

    private Connection connection;
    public Test(){
        try{
            connection = connect();
            System.out.println("CONNECTED TO DATABASE");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


    public static Connection connect() throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String serverName = "localhost";
        String databaseName = "TRENINGSDAGBOK";

        String url = "jdbc:mysql://" + serverName + "/" + databaseName + "?autoReconnect=true&useSSL=false";

        String username = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public static void main(String[] args) {
    	
//        try {
//            Test.ssh();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    	Test t = new Test();
    	Scanner scanner = new Scanner(System.in);
    	String sql = scanner.next();
    	String statement = connect().prepareStatement("");
    			
    			t.connect().prepareStatement(sql);
    	t.connect().prepareStatement()
    }
}
