package api;

import gui.UserProfile;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MainGame {
	public static String stateGame;
	public static String[] word;
	public static String[] answer;
	public static int level;
	
	public static void startGame() {
		String qr = "SELECT * FROM users INNER JOIN dataset ON users.level = Dataset.level";
		try (Statement st = JDBC.client.createStatement()) {
			ResultSet rs = st.executeQuery(qr);
			while (rs.next()) {
				word = (String[]) rs.getArray("word").getArray();
				answer = (String[]) rs.getArray("answer").getArray();
				if (UserProfile.stateGame.equals("New Game")) {
					level = rs.getInt("level") + 1;
				} else {
					level = rs.getInt("level");
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
