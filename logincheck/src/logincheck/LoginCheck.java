package logincheck;
import java.util.*;
public class LoginCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int flag1=0,flag2=0,flag3=0,flag4=0;

	    
	    System.out.println("username");
		String username = sc.nextLine();
		for(int i=0;i<username.length();i++)
		{
			char ch = username.charAt(i);
			
			if(!(Character.isLetter(ch)) && !(Character.isWhitespace(ch)))
			{
				flag1++;
			}
		}
		if(flag1!=0)
		{
			System.out.println("invalid username it must contain only whitespace or alphabets");
		}
		
		System.out.println("password");
		String password = sc.nextLine();
		int j=0,k=0,l=0;
		if(password.length()>8)
		{
		for(int i=0;i<password.length();i++)
		{
			char ch = password.charAt(i);
			
			if(Character.isUpperCase(ch))
			{
				j++;
			}
			if(Character.isDigit(ch))
			{
				k++;
			}
		    int code=Character.codePointAt(password, i);
		   if((code>31) && (code<127))
		   {
			   l++;
		   }
		}
		}
		else
		{
			System.out.println("invalid password length");
		}
		if(l==0 || j==0 || k==0)
		{
			System.out.println("invalid password it must contain one uppercase letter"
					+ "one digit & one special character");
		}
		
		System.out.println("retype password");
		String passwd = sc.nextLine();
		for(int i=0;i<password.length();i++)
		{
			char ch = password.charAt(i);
			
			if(ch!=passwd.charAt(i))
			{
				System.out.println("!!retype password must match password!!!!");
				break;
			}
		}
		
		System.out.println("email id");
		String emailid = sc.nextLine();
		for(int i=0;i<emailid.length();i++)
		{
			char ch = emailid.charAt(i);
		    int code=Character.codePointAt(emailid, i);
		    if(code==64 || code==46)
		    {
		    	flag4++;
		    }
		    
		}
		if(flag4!=2)
		{
			System.out.println("invalid emailid");
		}
		
		
		
	}
}
