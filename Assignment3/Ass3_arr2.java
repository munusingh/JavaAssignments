import java.util.*;
class Ass3_arr2
{
    public static void main(String args[])
    {
        int arr[]=new int[10];
        int n,sum1=0,sum2=0;
        int k=arr.length+1;
        int count1=0,count2=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Elements in the array:");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Number you want to find in the given array:");
        n=sc.nextInt();
        for(int i=0;i<10;i++)
        {
            if(arr[i]==n)
            {
                k=i;
            }
        }
        if(k>arr.length)
        {
            arr[arr.length/2]=n;
            k=arr.length/2;
        }
        for(int j=0;j<k;j++)
        {
            count1=count1+1;
            sum1=sum1+arr[j];
        }
        for(int l=k+1;l<10;l++)
        {
            count2=count2+1;
            sum2=sum2+arr[l];
        }
        System.out.println("The left side average is:"+(sum1/count1));
        System.out.println("The right side average is:"+(sum2/count2));
        System.out.println("The updated array is:");
        for(int m=0;m<10;m++)
        {
            System.out.print(arr[m]+" ");  
        }
    }
}