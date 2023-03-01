class Sumpro_con
{
    public static void main(String args[])
    {
        int s=0,d1,d2,t1,t2,t3;
        int n=Integer.parseInt(args[0]);
        d1=n%10;
        n=n/10;
        d2=n%10;
        t1=(d1%2==0 && d2%2==0)?d1*d2:0;
        d1=n%10;
        n=n/10;
        d2=n%10;
        t2=(d1%2==0 && d2%2==0)?d1*d2:0;
        d1=n%10;
        d2=n/10;
        t3=(d1%2==0 && d2%2==0)?d1*d2:0;
        s=t1+t2+t3;
      System.out.println("sum product of consecutive even digits of any four digit number is " +s);

    }
}