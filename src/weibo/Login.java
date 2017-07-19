//package weibo;
//
//import java.util.ArrayList;
//
//public class Login {
//	 ArrayList<String> myList = new ArrayList<String>();
//	 Egg s = new Egg();
//}

package weibo;

public class Login {
	
	private String user;
	private String pwd;
	
	public void set_user(String username) {
		user = username;
	}
	
	public String get_user() {
		return user;
	}
	
	public void set_pwd(String passwd) {
		pwd = passwd;
	}
	
	public String get_pwd() {
		return pwd;
	}
}
