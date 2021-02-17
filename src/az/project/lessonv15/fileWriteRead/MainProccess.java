package az.project.lessonv15.fileWriteRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainProccess {
	
	public static void main(String[] args) {
		String pathWrite = "";
		String pathRead = "";
		
		//Write
		try {
			pathWrite = write("test","Elshan HUSEYZNADA");
			System.out.println(pathWrite);
			
			//Read
			try {
				pathRead = read(pathWrite);
				System.out.println(pathRead);
			} catch (Exception e) {
				System.err.println(pathRead + e);
			}
			
		} catch (Exception e) {
			System.err.println(pathWrite + e);
		}
	}
	
	//WRITE
	public static String write(String fileName,String text) {
		String path = "C:/"+fileName+".txt";
		
		PrintWriter printWriter;
		try {
			
			printWriter = new PrintWriter(path);
			printWriter.println(text);
			printWriter.close();
			
		} catch (FileNotFoundException e) {
			path = "Error";
		}
		
		return path;
	}	
	//READ
	public static String read(String path) {
		String text = "";
		
		try {
			File file = new File(path);
			Scanner sc = new Scanner(file);
		
			
			while (sc.hasNextLine()) {
				text = sc.nextLine();
			}
		
		} catch (Exception e) {
				text = "Read file Error";
		}
		
		return text;
	}	

}
