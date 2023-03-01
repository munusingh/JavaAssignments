public class Find_diff_of_avg_pallprime
{
public static void main(String args[])
{
    int count1=0,count2=0,sum1=0,sum2=0,prime=0,res,rem;
    float avg,avg1,avg2 ;
    for(int i=23;i<=249;i++)
    {
        int temp=i;
        res=0;
        while(temp!=0)
        {
            rem=temp%10;
            res=res*10+rem;
            temp=temp/10;
        }
        if(i==res)
        {
            sum1=sum1+res;
            count1++;
        }
    }
    avg1=sum1/count1;
    System.out.println("Avg of Pallindromes in between 23 to 249:"+avg1);
    for(int i=23;i<=249;i++)
    {
       count2=0;
       for(int j=1;j<=i;j++)
       {
        if(i%j==0)
        {
            count2++;
        }
       }
        if(count2==2)
        {
           prime++;
           sum2=sum2+i;
     }
    }
    avg2=sum2/count2;
    System.out.println("Avg of Primes in between 23 to 249:"+avg2);
    avg=avg1-avg2;
    System.out.println("Difference of avg of pallindromes and primes in between 23 to 249:"+avg);


}
}
