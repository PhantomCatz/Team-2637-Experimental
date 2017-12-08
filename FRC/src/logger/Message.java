package logger;

import java.util.ArrayList;

public class Message {
	
	private String operation;
	private double time;
	private int logLevel;
	private final String  COMMA = ",";
	
	
	public Message(String op, double t, int log) {
		operation = op;
		t = time;
		logLevel = log;
	}
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public double getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public double getLogLevel() {
		return logLevel;
	}
	public void setLogLevel(Integer logLevel) {
		this.logLevel = logLevel;
	}
	
	
	// order to be printed
	
	@Override
	public String toString() {
		return time + COMMA + operation + COMMA + logLevel ;
	}
	
	public static void main(String args[]) {
		Message m1 = new Message("Move", 1000, 3);
		Message m2 = new Message("Turn", 1200, 2);
		Message m3 = new Message("Backwards", 1300, 4);
		
		ArrayList<Message> log = new ArrayList<Message>();
		
		log.add(m1);
		log.add(m2);
		log.add(m3);
		
		System.out.print(log);
		
		
	}

	
}
