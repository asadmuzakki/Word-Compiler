package api;

import java.sql.*;

public class Regis {
	public static boolean isValidRegis(String username) {
		try {
			String query = "SELECT * FROM users WHERE username = ?";
			try (PreparedStatement statement = JDBC.client.prepareStatement(query)) {
				statement.setString(1, username);
				try (ResultSet resultSet = statement.executeQuery()) {
					return !resultSet.next();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public static void insertUser(String username, String password) {
		try {
			String query = "INSERT INTO users (username, password, level, score) VALUES (?, ?, 0, 0)";
			try (PreparedStatement statement = JDBC.client.prepareStatement(query)) {
				statement.setString(1, username);
				statement.setString(2, password);
				statement.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
