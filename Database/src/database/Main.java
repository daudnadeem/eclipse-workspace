package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

	public static void main(String[] args) throws Exception {
		insertInto();
	}

	public static void insertInto() throws Exception {
		try {
			Connection con = getConnection();
			
			PreparedStatement create = con.prepareStatement("INSERT INTO doctors (id, lastname, firstname, phone, dateofbirth) VALUES (NULL, 'Nadeem', 'Tehmina', '(091)555-5555', '1958-10-4');");
			create.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		} finally {
			System.out.println("Function completed!");
		}
	}

	public static Connection getConnection() throws Exception {

		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/hospital_db";
			String username = "daudnadeem";
			String password = "123456";
			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connected!");
			return con;
		} catch (Exception e) {
			System.out.println(e);
		}

		return null;
	}
}
