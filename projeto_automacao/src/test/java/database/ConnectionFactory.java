package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection createConnection() throws SQLException {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("Erro ao carregar o driver jdbc. \n\n" + e.getMessage());
			e.printStackTrace();
		}

		String URL = "jdbc:oracle:thin:@18.219.39.123:1521:ORCLCDB";
		String user = "PORTALRCI";
		String password = "rcipwd";

		Connection conexao = null;
		conexao = DriverManager.getConnection(URL, user, password);

		return conexao;
	}
}
