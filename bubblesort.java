//Bubble Sort code by PP

class BubbleSort
{
    public static void PrintArray(int[]A)
    {
        int n = A.length;
        for(int i=0; i<n; i++)
        {
            System.out.print(A[i] + " \t");
        }
        System.out.println("");
    }
    public static void bubbleSort(int[]A)
    {
        int n = A.length;
        int temp;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                if(A[j]>A[j+1])
                {
                    temp = A[j+1];
                    A[j+1] = A[j];
                    A[j] = temp;
                }
                
            }
        }    
    }
    public static void main(String[] args) 
    {
        int A[] = {2,12,11,3,9,1};
        
        PrintArray(A);
        bubbleSort(A);
        PrintArray(A);
    }
}