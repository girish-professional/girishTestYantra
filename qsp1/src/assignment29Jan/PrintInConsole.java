package assignment29Jan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class PrintInConsole {
public static void main(String[] args) throws IOException {
	String path="C:\\Users\\giri26march\\Desktop\\names.txt";
	File f=new File(path); // open the file
	
	BufferedReader br=new BufferedReader(new FileReader(f)); // read the file and store in buffer 
	String st="";
	
	FileWriter writer=new FileWriter("C:\\Users\\giri26march\\Desktop\\writeName.txt");
	BufferedWriter brwriter=new BufferedWriter(writer);	
	while((st=br.readLine())!=null)
		{
			System.out.println(st);	
			brwriter.write(st);
			brwriter.newLine();

		}
	
	br.close();
	brwriter.close();
	}
}
 
