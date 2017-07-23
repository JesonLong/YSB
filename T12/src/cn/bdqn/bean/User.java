/**
 *    明日复明日，明日何其多。
 *
 */
package cn.bdqn.bean;

/**
 * @author Administrator
 *
 */
public class User {
	public String userName;
	public String password;
	
	
	//带参构造
	public User(String username, String passwrod) {
		this.userName=username;
		this.password=passwrod;
	}


	
	


	public boolean login(String username,String password){
		boolean flag=false;
		if (userName.equals(username)&&this.password.equals(password)) {
			flag=true;
		}else {
			flag=false;
		}
		return flag;
	}
}
