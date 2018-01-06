package org.usfirst.frc.team2637.robot;

import java.io.*;
import java.util.ArrayList;

public class logger {
	
	// change to match computer being used
	static File logFile = new File("C:\\Users\\Programming\\Desktop\\Logs\\log1.txt");
	
	// Number between 1-5
	public static int logLevel;
	
	// Priority of Operation (will get taken in)
	public static int opPrior;
	
	// Operation Name
	public static String operation;

	//to store all log messages in
	static ArrayList<Message> toLog = new ArrayList<Message>();
	
	//to print to file
	public static BufferedWriter bw;
	public static FileWriter fw;
	private PrintWriter writer;
	
	
	///////////////////////////////////////////////////////////////////////////
	
	
	public void setLogLevel(int i) {
		logLevel = i;
	}

	// checks if operation should be printed
	public static boolean canLog() {
		
		if(opPrior <= logLevel) {
			return true;
		}
		return false;	
	}
	
	// adds a message in toLog ArrayList
	public void add(String operation, int prior, double time) {
		
		if(canLog()) {
			Message m = new Message(operation, time, prior);
			toLog.add(m);
		}
		
	}
	
	// writes toLog into the log file
	public void write() {
		
		for(int i = 0; i < toLog.size(); i++) {
			toFile(toLog.get(i));
		}
		
	}
	
	// method to place each message in the file in its own line
	public static void toFile(Message m) {
		
		try {
		fw = new FileWriter(logFile, true);
		bw = new BufferedWriter(fw);
		
			bw.newLine();
			bw.write(m.toString());
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		try {

			if (bw != null)
				bw.close();

			if (fw != null)
				fw.close();

		} catch (IOException ex) {

			ex.printStackTrace();

		}

	}
		
	}
	
	
}
