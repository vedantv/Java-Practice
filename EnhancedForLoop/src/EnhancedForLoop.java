public class EnhancedForLoop {
	public static void main(String args[]){
		int a[]={2,3,4,5};
		int total=0;
		for(int x:a){
			total+=x;
		}
		System.out.println(total);
		change(a);
		for(int z:a)
		{
			System.out.println(z);
		}
	}
	public static void change(int x[]){
		for(int y=0;y<x.length;y++)
		{
			x[y]+=5;
		}
	}
}
