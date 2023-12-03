import api.JDBC;
import gui.LogIn;

public class App {
	public static void main(String[] args) {
		JDBC runtime = new JDBC();
		new LogIn().setVisible(true);
	}
}