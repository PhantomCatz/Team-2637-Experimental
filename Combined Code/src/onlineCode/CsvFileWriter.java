package onlineCode;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ashraf
 * 
 */
public class CsvFileWriter {
	
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	
	public static File logFile = new File("C:\\Users\\saral\\Desktop\\Logs\\log1.txt");;
	

	
	//CSV file header
	private static final String FILE_HEADER = "just a list of numbers";

	public static void writeCsvFile(String fileName) {
		
		ArrayList<String> messages = new ArrayList<String>();
		
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(logFile);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0; i < ages.lenght - 1; i++) {
				bw.newLine();
				bw.
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
		
	}
}
