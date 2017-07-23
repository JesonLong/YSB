/**
 *    明日复明日，明日何其多。
 *
 */
package T12_C1;

import java.util.Scanner;

import cn.bdqn.bean.User;

/**
 * @author Administrator
 *
 */
public class UserTest {
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("请输入如您的用户名：");
		String username=input.next();
		System.out.println("请输入您的密码：");
		String password=input.next();
		//做判断
		User user=new User("admin","123");
		
		user.login(username, password);
		 
		
		
	}
}
