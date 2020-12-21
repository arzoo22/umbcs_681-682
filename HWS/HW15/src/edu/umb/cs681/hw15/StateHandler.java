package edu.umb.cs681.hw15;

public class StateHandler implements Runnable {
	private AdmissionMonitor monitor;

	public StateHandler(AdmissionMonitor monitor) {
		super();
		this.monitor = monitor;
	}

	public void run() {
		System.out.println("Count of current visitors are: " + monitor.countCurrentVisitors());
	}
}
