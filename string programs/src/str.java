import java.util.*;
public class str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a,b,c;
		a = sc.next();
		b = sc.next();
		int i=0,j=0;
		c = "";
		while(i<a.length() && j<b.length())
		{
			c += a.charAt(i);
			c += b.charAt(j);
			i++;
			j++;
		}
		if(i<a.length())
		{
			while(i<a.length())
			{
				c += a.charAt(i);
				i++;
			}
		}
		if(j<b.length())
		{
			while(j<b.length())
			{
				c += b.charAt(j);
				j++;
			}
		}
		System.out.println("string c is "+c);

	}

}
