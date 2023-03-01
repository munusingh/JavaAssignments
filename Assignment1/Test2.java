import java.util.*;
class Test2
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,se=0,so=0,d1=0,d2=0,ed1=0,ed2=0,od1=0,od2=0,r;
        System.out.println("Enter a four digit Number");
        n=sc.nextInt();
        n1=n;
        System.out.println("Required Number is "+n1);
        d1=n%10;
        n=n/10;
        d2=n%10;
        n=n/10;
        ed1=((d1%2==0) && (d1!=2 && d1!=6)) ? d1 :0;
        ed2=((d2%2==0) && (d2!=2 && d2!=6)) ? d2 :0;
        se=se+ed1*ed2;
        d1 = n%10;
        d2 = n/10;
        od1=((d1%2!=0) && (d1!=3 && d1!=7)) ? d1 :0;
        od2=((d2%2!=0) && (d2!=3 && d2!=7)) ? d2 :0;
        so=so+od1*od2;
        r = se - so ;
        System.out.println("Sum of all even digits except 2 and 6 "+se);
        System.out.println("Sum of all odd digits except 3 and 7 "+so);
        System.out.println("Difference is "+r);
    }

}