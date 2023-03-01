class Sum_product
{
    public static void main(String args[])
    {
        int s=0,d1=0,d2=0;
        int n=Integer.parseInt(args[0]);
        d1=n%10;
        n=n/10;
        d2=n%10;
        s=s+d1*d2;
        d1=n%10;
        n=n/10;
        d2=n%10;
        s=s+d1*d2;
        d1=n%10;
        n=n/10;
        s=s+d1*n;
        System.out.println("sum product of consecutive digits of four digit number is " +s);

    }
}