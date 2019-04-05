package write_read_file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
	
	Write_txt fc = new Write_txt();
	fc.mytxt();
		
	System.out.print("Type the name of looking file here:");
	Scanner x = new Scanner(System.in);
	String nm=x.nextLine();
	
	BufferedReader bf = null;		
	try{
		bf = new BufferedReader(new FileReader(nm + ".txt"));
		String line;
		while((line=bf.readLine())!=null){
			System.out.println(line);
		}
	}catch(IOException e){
		e.printStackTrace();
	}finally{
		try {
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}


