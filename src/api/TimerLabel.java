package api;

import javax.swing.*;

public class TimerLabel extends JLabel implements Runnable {
	public int time;
	public boolean isRunning;
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
					Profile.score -= 5;
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
