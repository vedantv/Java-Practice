import java.util.*;
public class Str2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("input the string");
		s1 = sc.next();
		int i=0;
		while(i<s1.length())
		{
			if(((i+1)<s1.length() && s1.charAt(i+1)=='*' ) || ((i-1)>0 && s1.charAt(i-1)=='*') || s1.charAt(i)=='*')
			{
				
			}
			else
			{
				System.out.print(s1.charAt(i));				
			}
			i++;
		}
	}

}
