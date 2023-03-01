import java.util.*;
class diff_of_avg_eo
{
    public static void main(String args[])
    {
        int n,d=0,s1=0,s2=0,c1=0,c2=0,avg,avg1,avg2;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=Sc.nextInt();
       while(n>0)
        {   d=n%10;
            if(d%2==0 && d%4!=0)
               {
                c1++;
                s1=s1+d;
               }
        
            else if(d%2!=0 && d%3!=0)
               { 
                c2++;
                s2=s2+d;
               }
               n=n/10;
        }
        avg1=s1/c1;
        avg2=s2/c2;
        avg=avg1-avg2;
        System.out.println("sum of all even digits is " +s1);
        System.out.println("sum of all odd  digits is " +s2);
        System.out.println("no of even digit " +c1);
        System.out.println("no of odd digit " +c2);
        System.out.println("Avg of even digit " +avg1);
        System.out.println("Avg of odd digit " +avg2);
        System.out.println("Difference is" +avg);
    }
}