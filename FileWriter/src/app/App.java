package app;

import java.io.FileWriter;
import java.lang.String;
import java.util.Formatter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("File.txt");

        String str = new String("Hello World.xxxxxxxxx");
        //String str = new String.format("Hello World, %6.3d", 123.456);
        String str2 = new String("            ");

       str2 = str.format("Hello world %6.3f, %d, %s, %6.1f",123.456,23,"another string",123.456);
    
       fw.write(str2);

       fw.close();


       

       BufferedWriter bw = new BufferedWriter(fw);
       PrintWriter pw = new PrintWriter(bw);

       StringBuilder sb = new StringBuilder();

       sb.append("Hello World \n");
       sb.append(123.456 + "\n");
       sb.append(17);

       pw.write(sb.toString());
       pw.close();

    }
}