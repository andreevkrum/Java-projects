package write_read_file;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write_txt {
	public void mytxt(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Type the name of the new file here:");
		String name=scan.nextLine();
		System.out.println("Type your text here:");		
		String txt = scan.nextLine();
		try {
		File file = new File(name+".txt");
			if(!file.exists()){				
					file.createNewFile();
			}
		PrintWriter pw = new PrintWriter(file);
		pw.println(txt);
		pw.close();
		System.out.println("Done");
		} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}
	}
}
	

