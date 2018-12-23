import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class HomePage {
   ArrayList<Post> p;
   ArrayList<Feature> f;
   Account returnthis(Account a) {
	   return a;
   }
   HomePage() throws SQLException{
 	   Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Masroka","root","Fucklove7263218000");
	   Statement mystatement = myconn.createStatement();
	   ResultSet myRs = mystatement.executeQuery("select * from Masroka.Post");
	   while(myRs.next()) {
		   String text = myRs.getString("text");
		   boolean foundsth = myRs.getBoolean("foundsth");
		   String username = myRs.getString("UserName");
		   System.out.println();
		   System.out.println(username);
		   System.out.println();
		   System.out.println(text);
		   System.out.println();
          if(foundsth) {
   		   System.out.println("found sth");
          }
          else {
      		   System.out.println("search for sth");
          }
		   
	   }
	   myconn.close();
   }
   
}

