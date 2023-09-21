import java.util.Scanner;

class exeption_test
{
	//String s = null;
	
	public static void main(String []args)
	{
	int c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of a :");
	int a = sc.nextInt();
	System.out.println("Enter value of b :");
	int b = sc.nextInt();
	
	c = a/b;

	try{
		c = a/b;
	   }

	catch(ArithmeticException e)
	{
		System.out.println(e);
		System.out.println("Done with Arithmetic exception");
		System.out.println("Now lets start with the null pointer exception");
	}
	
	String s = null;
	System.out.println(s.length());
	try{
		System.out.println(s.length());
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.out.println("Done with the Null pointer exception");
		System.out.println("Now lets start with array index out of bound exception");
	}
	int[]arr = new int[8];
	arr[9] = 20;
	try{
		arr[9] = 20;
	}
	catch(Exception e){
		System.out.println(e);
		System.out.println("Done with the ArrayindexOutofBound Exception");

	}
	}

}



	
	
	
	
	
	