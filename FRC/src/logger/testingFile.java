package logger;

import java.io.*;


public class testingFile {

	// can be competition, practice or testing
	private String importance;
	
	private static String message = "hi";
	
	
	public static void main(String[] args) {
		File log = new File("C:\\Users\\Programming\\Desktop\\Logs\\log.txt");
		
		try {
			FileWriter fw = new FileWriter(log, true);
			fw.write(message);
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();}
		}
		
		
		/*PrintWriter writer;
		try {
			writer = new PrintWriter(log);
			writer.println("The first line");
			writer.println("The second line");

			writer.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/
	
	public static void print() {
		
	}

}
