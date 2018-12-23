import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Post {
	String text;
	Account a;
	boolean foundsth;
	ArrayList<comment> c;
	Post(){
		
	}
	Post(String text,Account a,boolean foundsth) throws SQLException{
		this.text = text;
		this.a = a;
		this.foundsth = foundsth;
	 	   Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Masroka","root","Fucklove7263218000");
	 	   PreparedStatement myStmt = myconn.prepareStatement("insert into Post(text,foundsth,UserName) values(?,?,?)");
		   myStmt.setString(1, text);
		   myStmt.setBoolean(2, foundsth);
		   myStmt.setString(3, a.Username);
		   myStmt.executeUpdate();
		   myconn.close();
	}
	
	
	

}

