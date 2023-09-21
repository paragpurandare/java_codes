
import java. util.Scanner;


class PrimeNO
{
	public static void main(String[] args) 
      {
      	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the no : ");
        	int n = sc.nextInt();
        	boolean isPrime = true;
            
        	for(int i=2; i<n; i++)
            {
                if(n%i == 0)
                {
                    isPrime = false;    
                }
               
       	 }
 		if(isPrime == false)
        	{
            	System.out.println( n + " Not a Prime no");
        	}
        	else
        	{
            	System.out.println( n + " Is a Prime no");
        	}
    
   
    	}
}