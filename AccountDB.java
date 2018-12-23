
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class AccountDB extends ObjectOutputStream{
	ArrayList<Account> accounts;
	
	public AccountDB(OutputStream out) throws IOException {
	    super(out);
	  }
	  protected void writeStreamHeader() throws IOException {
	    reset();
	  }
    public void Writeaccount(Account a) throws IOException {
    	FileOutputStream fout = new FileOutputStream("C:\\Users\\amr\\eclipse-workspace\\Masroka\\AccocuntDB.ser");
    	ObjectOutputStream oos = new ObjectOutputStream(fout);
    	oos.writeObject(a);
    	oos.close();
    }
    public void readaccount() throws IOException {
    	ObjectOutputStream oos = null;
    	FileOutputStream fout = null;
    	try{
    	    fout = new FileOutputStream("C:\\Users\\amr\\eclipse-workspace\\Masroka\\AccocuntDB.ser", true);
    	    oos = new ObjectOutputStream(fout);
    	    oos.writeObject(accounts);
    	} catch (Exception ex) {
    	    ex.printStackTrace();
    	} finally {
    	    if(oos != null){
    	        oos.close();
    	    } 
    	}
   
    	
    }

	
}

