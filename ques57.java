import java.util.*;
class q57
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=n-1;i!=-1;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}