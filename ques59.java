import java.util.*;
class q59
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int newarr[]=new int[n];
        System.out.println("Enter the elements of array:");
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(i==n-1)
               newarr[0]=arr[i]; 
            else
                newarr[i+1]=arr[i];
            c--;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(newarr[i]+" ");
        }
    }
}