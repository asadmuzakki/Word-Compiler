package api;

import java.sql.*;

public class Profile {
	public static String username;
	public static int level;
	public static int score;
	public static void showProfile(int id){
		try{
			String query = "SELECT * FROM users WHERE id = ?";
			PreparedStatement statement = JDBC.client.prepareStatement(query);
			statement.setInt(1, id);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				username = resultSet.getString("username");
				level = resultSet.getInt("level");
				score = resultSet.getInt("score");
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
