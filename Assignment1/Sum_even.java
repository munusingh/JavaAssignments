class Sum_even
{
    public static void main(String args[])
    {
    int n=1234,s=0,t=0,d=0;
    d=n%10;
    t=d%2 == 0 ? d: 0;
    s=s+t;
    n=n/10;
    d=n%10;
    t=n%2== 0 ? d : 0;
    s=s+t;
    n=n/10;
    d=n%10;
    t=n%2==0 ? d : 0;
    s=s+t;
    n=n/10;
    d=n%10;
    t=d%2==0 ? d :0;
    s=s+t;
    System.out.println("sum of all even digits is " +s);
    }
}