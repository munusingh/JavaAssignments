class Diff_evenodd
{
    public static void main(String args[])
    {
    int n=2451,s1=0,s2=0,t1=0,t2=0,d=0,c1=0,c2=0;
    float avg1,avg2,avg;
    d=n%10;
    t1=d%2 == 0 && d%4!=0 ? d: 0;
    t1=d%2 == 0 && d%4!=0 ?c1++:d;
    t2=n%2!=0 && d%3!=0 ? d: 0;
    t2=n%2!=0 && d%3!=0 ? c2++:d;
    s1=s1+t1;
    s2=s2+t2;
    n=n/10;
    d=n%10;
    t1=n%2== 0 && d%4!=0 ? d: 0;
    t1=d%2 == 0 && d%4!=0 ?c1++:d;
    t2=n%2!=0 && d%3!=0 ? d: 0;
    t2=n%2!=0 && d%3!=0 ? c2++:d;
    s1=s1+t1;
    s2=s2+t2;
    n=n/10;
    d=n%10;
    t1=n%2==0 && d%4!=0 ? d: 0;
    t1=d%2 == 0 && d%4!=0 ?c1++:d;
    t2=n%2!=0 && d%3!=0 ? d: 0;
    t2=n%2!=0 && d%3!=0 ? c2++:d;
    s1=s1+t1;
    s2=s2+t2;
    n=n/10;
    d=n%10;
    t1=d%2==0 && d%4!=0 ? d: 0;
    t1=d%2 == 0 && d%4!=0 ?c1++:d;
    t2=n%2!=0 && d%3!=0 ? d: 0;
    t2=n%2!=0 && d%3!=0 ? c2++:d;
    s1=s1+t1;
    s2=s2+t2;
    avg1=s1/c1;
    avg2=s2/c2;
    avg=avg1-avg2;
    System.out.println("sum of all even digits is " +s1);
    System.out.println("sum of all odd  digits is " +s2);
    System.out.println("no of even digit " +c1);
    System.out.println("no of odd digit " +c2);
    System.out.println("Avg of even digit " +avg1);
    System.out.println("no of odd digit " +avg2);
    System.out.println("Difference is" +avg);
     }
}