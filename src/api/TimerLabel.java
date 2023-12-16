package api;

import javax.swing.*;

public class TimerLabel extends JLabel implements Runnable{
	private int time;
	private boolean isRunning;
	private Thread thread;
	
	public TimerLabel() {
		time = 300;
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
				if(time == 0) {
					stop();
				}
				time--;
				setText(getTime());
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
