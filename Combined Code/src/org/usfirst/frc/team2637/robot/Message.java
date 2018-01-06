package org.usfirst.frc.team2637.robot;

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
}

