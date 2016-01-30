import java.net.URI;


public class User {
	private String username;
	private String fullname;
	private int  age;
	private String password;
	
	
	
	//general constructor
	public User(String user, String pass){
		this.username =user;
		this.password=pass;
		
	}
	
	
	
	
	//String Holder
      public static void setUserProfile(URI uri){  
    	  String tempUri = uri.getPath();
    	 System.out.println(tempUri); 
      }
}
