import java.util.*;
class Assign3_arr1
{
    public static void main(String args[])
    {
        int num[]=new int[30];
        int ne=0,no=0,se=0,so=0,ao=0,npr=0,prime=0,npl=0,spr=0,spl=0,apr=0,apl=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 30 number");
        for(int i=0;i<30;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Cointains of array:");
        for(int i=0;i<30;i++)
        {
            System.out.println("Num[ " +i+ " ] = "+num[i]);  
        }
        for(int i=0;i<30;i++)
        {
            if(num[i]%2==0)
            {
                ne++;
                se=se+num[i];
            }
            else
            {
                no=no+1;
                so=so+num[i];
            }
        }
        for(int i=0;i<30;i++)
        {
            npr=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
               {
                 npr++;
               }
            }
            if(npr==2)
            {
               prime++;
               spr=spr+num[i];
            }
        }
        for(int i=0;i<30;i++)
        {
            int temp=i;
            int res=0;
            while(temp!=0)
            {
            int rem=temp%10;
            res=res*10+rem;
            temp=temp/10;
            }
            if(i==res)
            {
            spl=spl+res;
            npl++;
            }
        }
    System.out.println("Average of even number is:"+se/ne);
    System.out.println("Average of odd number is:"+so/no);
    System.out.println("Average of prime number is:"+spr/npr);
    System.out.println("Average of pallindrome number is:"+spl/npl);           


    }
    
}
