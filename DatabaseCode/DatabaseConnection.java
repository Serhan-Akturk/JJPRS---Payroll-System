package DatabaseCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {

	public static Connection getDatabase() throws SQLException {
		 return DriverManager.getConnection("jdbc:mysql://localhost:3306/useraccounts",
		 "root", "2785bri");
	}

}
