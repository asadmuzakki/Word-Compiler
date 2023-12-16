package api;

import java.sql.*;

public class Login {
public static boolean isValidUser(String username, String password) {
		boolean found = false;
		try {
			String query = "SELECT * FROM users WHERE username = ? AND password = ?";
			PreparedStatement statement = JDBC.client.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, password);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				JDBC.setUser_id(resultSet.getInt("id"));
				found = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return found;
	}
}
