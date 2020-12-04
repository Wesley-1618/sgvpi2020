package startBank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectPg {
	public static void main(String[] args) {
		new ConnectPg().testConection();
		// new ConnectPg().testConection();
		CreateBDO crtBdo = new CreateBDO();
		crtBdo.processar();
	}

	void testConection() {
		Connection link = conectPostgree();
		if (link != null) {
			System.out.println("Conectado com sucesso!");
			try {
				link.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Falha na conexao!");
		}
	}

	public Connection conectPostgree() {
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/sgvpi";
			Connection con = DriverManager.getConnection(url, "postgres", "12345");
			System.out.println("Apos obter conexao.");
			return con;
		} catch (ClassNotFoundException e) {
			ConnectPg.printSQLException(null, e);
			ConnectPg.printSQLException(null, e);
		} catch (SQLException e) {
			ConnectPg.printSQLException(e, null);
			ConnectPg.printSQLException(e, null);
		}
		return null;

	}

	public static void printSQLException(SQLException tst, Exception exception) {
		for (Throwable e : tst) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				if (((SQLException) e).getSQLState().equalsIgnoreCase("42P01")) {
					System.err.println("Tabela não existe: ");
					break;
				} else {
					System.err.println("SQLState: " + ((SQLException) e).getSQLState());
					System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
					System.err.println("Message: " + e.getMessage());
					Throwable t = tst.getCause();
					while (t != null) {
						System.out.println("Cause: " + t);
						t = t.getCause();
					}
				}
			}
		}
		if (exception != null) {
			exception.toString();
			System.out.println("\n");
			exception.printStackTrace();
		}
	}
}