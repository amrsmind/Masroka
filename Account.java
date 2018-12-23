import java.util.Properties;
import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  

public class Account {
    String Username;
    String password;
    String Email;
    Feature f;
    
    Account(){
    	//
    }
    Account(String Username,String password,String Email){
        this.Username = Username;
        this.password = password;
        this.Email = Email;
        f = new Feature(this);
    }
    Account(String Username,String password){
        this.Username = Username;
        this.password = password;
        this.Email = Email;
        f = new Feature(this);
    }
    


}
