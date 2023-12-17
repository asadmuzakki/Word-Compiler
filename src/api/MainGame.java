package api;

import gui.UserProfile;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
			statement.setInt(1, Profile.score);
			statement.setInt(2, level+1);
			statement.setInt(3, JDBC.getUser_id());
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void updateScoreIfTimesUp(){
		try {
			String query = "UPDATE users SET score = ? WHERE id = ?";
			PreparedStatement statement = JDBC.client.prepareStatement(query);
			statement.setInt(1, Profile.score);
			statement.setInt(2, JDBC.getUser_id());
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String[] shuffleWord() {
		List<String> shuffledList = new ArrayList<>(Arrays.asList(word));
		Collections.shuffle(shuffledList);
		return shuffledList.toArray(new String[0]);
	}
}
