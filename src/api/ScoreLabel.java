package api;
import javax.swing.*;
public class ScoreLabel extends JLabel implements Runnable{
	private boolean isRunning;
	private Thread thread;
	
	public ScoreLabel() {
		isRunning = false;
		thread = new Thread(this);
		start();
		thread.start();
	}
	
	public void start() {
		isRunning = true;
	}
	
	public void stop() {
		isRunning = false;
	}

	public void reset() {}
	
	@Override
	public void run() {
		while (true) {
			if (isRunning) {
				setText("Score : " + Profile.getScore());
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
