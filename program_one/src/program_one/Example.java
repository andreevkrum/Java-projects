
package program_one;
import java.util.Scanner;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Example{
	public static void main(String[]args) throws Exception{
		createTable();
		post();
		get();
	}
	
	public static ArrayList<String> get()throws Exception{
		try{
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT first, last FROM krumsname");			
			ResultSet result = statement.executeQuery();
			ArrayList<String> array = new ArrayList<String>();
			while(result.next()){
				System.out.print(result.getString("first"));
				System.out.print(" ");
				System.out.print(result.getString("last"));
				System.out.print(" * ");

			array.add(result.getString("last"));
			}
			System.out.println("All records have been selected");
			return array;
			
			
		}catch(Exception e){
			System.out.println(e);
		}return null;
	}
	
	public static void post() throws Exception{
		Scanner scan1 = new Scanner(System.in);
		System.out.print("vyvedi ime: ");
		String var1 = scan1.nextLine();
		System.out.print("vyvedi familiya:");
		String var2= scan1.nextLine();
		
		//String var1="";
		//public String var2;
		try{
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO krumsname (first,last) VALUES('"+var1+"' , '"+var2+"')");
			posted.executeUpdate();			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			scan1.close();
			System.out.println("Insert completed");
		}
	}
	
	public static void createTable() throws Exception{
		try{
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS Krumsname(id int NOT NULL AUTO_INCREMENT, first varchar(255) ,last varchar(255), PRIMARY KEY(id))");
			create.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			System.out.println("Function complete");
		}
	}
		
	public static Connection getConnection() throws Exception{
		try{
			String driver="com.mysql.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/golearnfast";
			String username="root";
			String password="root";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			return conn;
		} catch(Exception e){
			System.out.println(e);
		}
		return null;
		}
}
	





