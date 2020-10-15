package Getfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GetFile {

	public ArrayList<String> getList() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("src//linecounter//LineCounter.java"));
		ArrayList<String> listOfLines = new ArrayList<>(); 
		String line = br.readLine(); 
		while (line != null) { 
			listOfLines.add(line); 
			line = br.readLine(); 
			} 
		br.close();
		return listOfLines;
	}
}