1.	class Table{  
2.	  
3.	 synchronized static void printTable(int n){  
4.	   for(int i=1;i<=10;i++){  
5.	     System.out.println(n*i);  
6.	     try{  
7.	       Thread.sleep(400);  
8.	     }catch(Exception e){}  
9.	   }  
10.	 }  
11.	}  
12.	  
13.	class MyThread1 extends Thread{  
14.	public void run(){  
15.	Table.printTable(1);  
16.	}  
17.	}  
18.	  
19.	class MyThread2 extends Thread{  
20.	public void run(){  
21.	Table.printTable(10);  
22.	}  
23.	}  
24.	  
25.	class MyThread3 extends Thread{  
26.	public void run(){  
27.	Table.printTable(100);  
28.	}  
29.	}  
30.	class MyThread4 extends Thread{  
31.	public void run(){  
32.	Table.printTable(1000);  
33.	}  
34.	}  
35.	  
36.	public class TestSynchronization4{  
37.	public static void main(String t[]){  
38.	MyThread1 t1=new MyThread1();  
39.	MyThread2 t2=new MyThread2();  
40.	MyThread3 t3=new MyThread3();  
41.	MyThread4 t4=new MyThread4();  
42.	t1.start();  
43.	t2.start();  
44.	t3.start();  
45.	t4.start();  
46.	}  
47.	}  
