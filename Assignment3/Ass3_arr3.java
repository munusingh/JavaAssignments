import java.util.*;
class Ass3_arr3
{
    public static void main(String args[])
    {
        int num[]=new int[10];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 number");
        for(int i=0;i<10;i++)
        {
            num[i]=sc.nextInt();
        }


        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(num[i]>num[j])
                {
                    int temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }


        }

        System.out.println("Elements of array after sorting:");
        for(int i=0;i<10;i++)
        {
            System.out.print(num[i] + "  ");  
        }

    int d1=num[1];
    int d2=num[7];
    sum=sum+d1*d2;
    System.out.println("\nSum of product of 2nd smallest and third largest is:"+sum);
    }
}
    
        