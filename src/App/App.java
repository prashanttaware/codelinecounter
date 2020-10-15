package App;

import java.io.IOException;
import java.util.ArrayList;

import Getfile.GetFile;
import linecounter.LineCounter;

public class App {

	public static void main(String[] args) throws IOException {
		
		//code to get file into arraylist
		GetFile getFile = new GetFile();
		ArrayList<String> list = getFile.getList();
		
		//code to calculate get file line counter
		LineCounter lc = new LineCounter(); 
		int count = lc.countLines(list);
		
		//final line count
		System.out.println(count);
	}

	
}