class Sum_lrzs
{
    public static void main(String args[])
    {
        int s=0,d=0,a,b,c,e,f,g;
        int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        d=n1%10;
        s=s+d;
        n1=n1/10;
        d=n1%10;
        s=s+d;
        n1=n1/10;
        d=n1%10;
        s=s+d;
        n1=n1/10;
        s=s+n1;
        System.out.println("sum product of consecutive digits of four digit number is" +s);
        a=n2/1000;
        n2=n2%100;
        b=n2/100;
        n2=n2%100;
        c=n2/10;
        System.out.println("3rd digit of four digit number is" +c);
        e=s << c;
        f=s >> c;
        g=s >>> c;
        System.out.println("Leftshift is = " +e);
        System.out.println("Rightshift is = " +f);
        System.out.println("Zerofill Rightshift is = " +g);
        

    }
}