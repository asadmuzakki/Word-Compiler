package api;

import gui.UserProfile;
import gui.Main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainGame {
	public static String stateGame = UserProfile.stateGame;
	public static String[] word;
	public static String[] answer;
	public static int level;
	
	public static void startGame() {
		if (stateGame.equals("New Game")) {
			level += 1;
			updateuser(JDBC.getUser_id());
		}
		String qr = "SELECT * FROM users INNER JOIN dataset ON users.level = dataset.level WHERE users.id = " + JDBC.getUser_id();
		try (Statement st = JDBC.client.createStatement()) {
			ResultSet rs = st.executeQuery(qr);
			while (rs.next()) {
				word = (String[]) rs.getArray("word").getArray();
				answer = (String[]) rs.getArray("answer").getArray();
				level = rs.getInt("level");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void updateuser(int userId) {
		try {
			String query = "UPDATE users SET level = ? WHERE id = ?";
			PreparedStatement statement = JDBC.client.prepareStatement(query);
			statement.setInt(1, level);
			statement.setInt(2, userId);
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void updateScore(){
		try {
			String query = "UPDATE users SET score = ?, level = ? WHERE id = ?";
			PreparedStatement statement = JDBC.client.prepareStatement(query);
			statement.setInt(1, Main.score);
			statement.setInt(2, level+1);
			statement.setInt(3, JDBC.getUser_id());
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
