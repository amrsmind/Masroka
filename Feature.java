import java.sql.SQLException;
import java.util.Scanner;

public class Feature {
   Account a;
   Feature(){
	   //
   }
   Feature(Account a){
	   this.a = a;
   }
   public void Post() throws SQLException {
	   System.out.println("enter post");
	   Scanner sc = new Scanner(System.in);
	   String Text = sc.nextLine();
	   Scanner scbool = new Scanner(System.in);
	   System.out.println("enter true if you found sth or false if you search for sth");
	   boolean foundsth = scbool.nextBoolean();
	   Post p = new Post(Text,a,foundsth);
	   System.out.println("Posted");
   }
   public void comment(String Text) {
	   
   }
   public void search(String text) {
	   
   }
   public void viewhp() throws SQLException{
	   HomePage hp = new HomePage();
   }
   public void modifycomment() {
	   
   }
   public void modifypost() {
	   
   }
   
}

