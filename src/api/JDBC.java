package api;

import java.sql.*;

public class JDBC {
	public static Connection client;
	public static String user_id;
	
	public JDBC() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (Exception ex) {
			System.out.println("Error: unable to load driver class!");
			System.exit(1);
		}
		try {
			String url = "jdbc:postgresql://db.xxsioqhzxyqhbxmgwfum.supabase.co:5432/postgres?user=postgres&password=tubespboklp19";
			client = DriverManager.getConnection(url);
		} catch (Exception e) {
			System.out.println("Connection failure.");
			System.exit(1);
		}
	}
	public static void setUser_id(String user_id) {
		JDBC.user_id = user_id;
	}
	public static String getUser_id() {
		return user_id;
	}
}