// "static void main" must be defined in a public class.

import java.util.Scanner;

public class targetsum
{
    void sum(int x, int[] arr) 
	{
    		for (int i = 0; i < 8; i++) 
    		{
        		for (int j = i + 1; j < 8; j++) 
        		{
            		int sum = arr[i] + arr[j];
            		if (arr[i] == arr[j]) 
            		{
                			System.out.println("Duplicate elements");
            		}
        			if (sum == x)
        			{
            			System.out.print(arr[i] + ",");
           				System.out.print(arr[j]);
            			System.out.println();
            			break;
        			}
        	    }
 	    }
    }
	public static void main(String[] args)
	{
            targetsum a1= new targetsum();
    		int[] arr = new int[8];
    		Scanner sc = new Scanner(System.in);
    		System.out.println("enter the array : " + " ");
    		for (int i = 0; i < 8; i++)    
    		{
        		arr[i] = sc.nextInt();
    		}
    		
    		System.out.print("Enter target sum : ");
		int a = sc.nextInt();
    		a1.sum(a, arr);
	}
}




// public class Main 
// {
//     public static void main(String[] args) 
//     {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the array Size : ");
//         int n = sc.nextInt();
//         
//         System.out.println(" ");
//         int A[n];
//         for(int i = 0; i<n; i++)
//         {
//             int e = sc.nextInt();
//             println("Enter Elements :");
//             int c = e;
//         }
//         for(int j =0; j<n; j++){
//             System.out.print("")
//         }
        
    
//     }
// }
// }


import java.util.Scanner;
public class Adder 
{
    static void targetsum(int x, int[] arr) {
    for (int i = 0; i < 8; i++) 
    {
        for (int j = i + 1; j < 8; j++) 
        {
            int sum = arr[i] + arr[j];
            if (arr[i] == arr[j]) 
            {
                System.out.println("Duplicate elements");
            }
        if (sum == x)
        {
            System.out.print(arr[i] + ",");
            System.out.print(arr[j]);
            System.out.println();
            break;
        }
        }
    }
}
public static void main(String[] args)
{
    int[] arr = new int[8];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array : " + " ");
    for (int i = 0; i < 8; i++)    
    {
        arr[i] = sc.nextInt();
    }
    int a = sc.nextInt();
    System.out.print("Enter target sum : ");
    targetsum(a, arr);
}
}