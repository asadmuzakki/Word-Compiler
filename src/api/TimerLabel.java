package api;

import gui.UserProfile;

import javax.swing.*;

public class TimerLabel extends JLabel implements Runnable {
	private int time;
	private boolean isRunning;
	private Thread thread;

	public TimerLabel() {
		time = 300;
		isRunning = false;
		thread = new Thread(this);
		thread.start();
		start();
	}
	
	public void start() {
		isRunning = true;
	}
	
	public void stop() {
		isRunning = false;
		MainGame.updateScoreIfTimesUp();
		Profile.showProfile();
		
		new UserProfile().setVisible(true);
		JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
		if (frame != null) {
			frame.dispose();
		}
	}
	
	public void reset() {
		time = 300;
	}
	
	public String getTime() {
		int minutes = time / 60;
		int seconds = time % 60;
		return String.format("%02d:%02d", minutes, seconds);
	}
	
	@Override
	public void run() {
		while (true) {
			if (isRunning) {
				time--;
				SwingUtilities.invokeLater(() -> setText("WAKTU: " + getTime()));
				if (time == 0) {
					stop();
				}
				if (time % 15 == 0) {
					int score = Profile.getScore();
					Profile.setScore(score -= 5);
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
