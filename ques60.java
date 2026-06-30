import java.util.*;
class q60
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int newarr[]=new int[n];
        System.out.println("Enter the elements of array:");
        int i,c=n-1,x=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                newarr[c]=0;
                c--;
                x++;
            }
            else
            {
                newarr[x]=arr[i];
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(newarr[i]+" ");
        }
    }
}