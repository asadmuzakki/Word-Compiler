package api;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Profile {
	private static String username;
	private static int level;
	private static int score;
	public static String getUsername() {
		return username;
	}
	public static int getLevel() {
		return level;
	}
	public static int getScore() {
		return score;
	}
	public static void setScore(int score) {
		Profile.score = score;
	}
	public static void showProfile() {
		try {
			String query = "SELECT * FROM users WHERE id = ?";
			PreparedStatement statement = JDBC.client.prepareStatement(query);
			statement.setInt(1, JDBC.getUser_id());
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
