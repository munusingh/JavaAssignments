class Sum_product2
{
    public static void main(String args[])
    { 
        int s=0,d1=0,d2=0;
        int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        d1=n1%10;
        d2=n2%10;
        s=s+d1*d2;
        n1=n1/10;
        n2=n2/10;
        d1=n1%10;
        d2=n2%10;
        s=s+d1*d2;
        n1=n1/10;
        n2=n2/10;
        d1=n1%10;
        d2=n2%10;
        s=s+d1*d2;
        d1=n1/10;
        d2=n2/10;
        s=s+d1*d2;
        System.out.println("sum = "+s);
    }
}


