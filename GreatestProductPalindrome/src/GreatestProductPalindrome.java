import java.util.*;
public class GreatestProductPalindrome {

	public static void main(String args[]){
		int i,j,k,grt=0,n1=0,n2=0;
		System.out.println("3 digit or 2 digit?");
		Scanner in=new Scanner(System.in);
		int d = in.nextInt();
		if(d==2)
		{
			System.out.println();
		}
		else
		{
			for(j=100;j<1000;j++)
			{
				for(k=100;k<1000;k++)
				{
					i=j*k;
					int temp,rem,sum=0;
					temp=i;
					while(i>0)
					{
						rem=i%10;
						sum=sum*10+rem;
					    i/=10;
					}
					if(sum==temp)
					{
						if(sum>grt)
						{
						grt=temp;
						n1=j;
						n2=k;
						}
					}
				}
			}
			System.out.println(grt +" "+n1+" "+n2);
		}
	}
}
