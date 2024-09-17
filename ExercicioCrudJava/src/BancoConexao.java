import java.sql.*;

public class BancoConexao{
	
	private static final String URL = "jdbc:postgresql://localhost:5432/ex2bancodedados";
	private static final String USER = "postgres";
	private static final String PASSWORD = "1508";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
}