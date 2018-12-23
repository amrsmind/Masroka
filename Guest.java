import java.util.Scanner;
import java.sql.*;
public class Guest {
	
   public static void main(String args[]) throws SQLException  {
        Guest.fakemain();
    }
   public static void fakemain() throws SQLException {
	   Guest g = new Guest();
   	System.out.println("1.sign up");
   	System.out.println("2.log in");
       int choice; 
       String email = "",username = "",password = "";
       Scanner in = new Scanner(System.in);
       choice = in.nextInt();
   	if(choice ==1) {
   		boolean l = false; 
   		while(!l) {	
   		System.out.println("enter email : ");
   		email = in.next();
   		System.out.println("enter username :");
   		username = in.next();
   		System.out.println("enter password :");
           password = in.next();
           l = g.register(email, username, password);
           if(l == false) {
           	System.out.println("dublicated username tryagain");
           }
   		}
   		Guest.fakemain();
   	}
   	else if(choice ==2) {
   		boolean l = false;
   		while(!l) {
   		System.out.println("enter username :");
   		username = in.next();
   		System.out.println("enter password :");
           password = in.next();
           l = g.login(username,password);
           if(l == false) {
           	System.out.println("wrong username or password");
           }
   		}
   		Account a = new Account(username,password);
   		while(choice !=3) {
   		System.out.println();	
   		System.out.println("1.show Homepage");
   		System.out.println("2.post");
   		System.out.println("3.back");
   		
   		choice = in.nextInt();
   		if(choice ==1) {
   			a.f.viewhp();
   		}
   		else if(choice ==2) {
   			a.f.Post();
   		}
   		}
   			Guest.fakemain();
   		}
   		
   }
    
    public boolean register(String email,String Username,String password) throws SQLException{
 	   Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Masroka","root","Fucklove7263218000");
       PreparedStatement myStmt = myconn.prepareStatement("select * from Masroka.account where UserName = ?");
       myStmt.setString(1, Username);
       ResultSet myrs = myStmt.executeQuery();
	   while(myrs.next()){
            return false;
	   }
	   myconn.close();
	   myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Masroka","root","Fucklove7263218000");
	   myStmt = myconn.prepareStatement("insert into account values(?,?,?)");
	   myStmt.setString(1, Username );
	   myStmt.setString(2, password );
	   myStmt.setString(3, email );
	   myStmt.executeUpdate();
	   myconn.close();
	   return true;
	   }
    public boolean login(String username,String password) throws SQLException{
    	 Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Masroka","root","Fucklove7263218000");
         PreparedStatement myStmt = myconn.prepareStatement("select * from account where UserName = ? and Pass = ?");
         myStmt.setString(1, username);
         myStmt.setString(2, password);
         ResultSet myrs = myStmt.executeQuery();
         while(myrs.next()) {
        	 return true;
         }
         return false;
    }
    public void validate(int code,RegisterForm rg) {
    	
    }

	
}

