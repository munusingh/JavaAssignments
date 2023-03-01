class mul_evenodd
{
    public static void main(String args[])
    {
        int d1,d2,ed=0,od=0,sum=0;
        int n1=Integer.parseInt(args [0]);
        int n2=Integer.parseInt(args [1]);
        d1=n1%10;
        d2=n2%10;
        ed=(d1%2==0)?d1:0;
        od=(d2%2!=0)?d2:0;
        sum=sum+ed*od;
        n1=n1/10;
        n2=n2/10;
        d1=n1%10;
        d2=n2%10;
        ed=(d1%2==0)?d1:0;
        od=(d2%2!=0)?d2:0;
        sum=sum+ed*od;
        n1=n1/10;
        n2=n2/10;
        d1=n1%10;
        d2=n2%10;
        ed=(d1%2==0)?d1:0;
        od=(d2%2!=0)?d2:0;
        sum=sum+ed*od;
        d1=n1/10;
        d2=n2/10;
        ed=(d1%2==0)?d1:0;
        od=(d2%2!=0)?d2:0;
        sum=sum+ed*od;
      System.out.println("sum = " +sum );

    }
}