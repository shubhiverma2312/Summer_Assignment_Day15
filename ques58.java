import java.util.*;
class q58
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int newarr[]=new int[n];
        System.out.println("Enter the elements of array:");
        int i,c=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=1;i<=n;i++)
        {
            if(i==n)
               newarr[c]=arr[0]; 
            else
                newarr[c]=arr[i];
            c++;
        }
        for(i=0;i<n;i++)
        {
            System.out.print(newarr[i]+" ");
        }
    }
}