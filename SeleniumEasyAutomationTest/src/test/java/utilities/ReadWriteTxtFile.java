package utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTxtFile {
	
	
	
	public void readFromTxtFile(String fileName) throws IOException {
		
		
		File file=new File("src/test/resources/testdata/"+fileName);
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferReader=new BufferedReader(fileReader);
		
		String line=bufferReader.readLine();
		
	//	System.out.println(line);
		
		while(line != null) {
		System.out.println(line);
		line=bufferReader.readLine();
		}
		
			
	}
	
	
	
	
	
	
	
	
	
	
	public void writeToTxtFile(String fileName, String newLine) throws IOException {
		File file=new File("src/test/resources/testdata/"+fileName);	
	    FileWriter fw= new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(newLine);
		bw.newLine();
		bw.flush();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
