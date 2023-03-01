import java.util.*;
class Find_fact_lar_sma
{
    public static void main(String args[])
    {
    int a,b,c,g,s,diff,f=1;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter first number:");
    a=sc.nextInt();
    System.out.println("Enter second number:");
    b=sc.nextInt();
    System.out.println("Enter third number:");
    c=sc.nextInt();
    if(a>b)
    {
        if(a>c)
        {
            g=a;
        }else{
            g=c;
             }
    }else{
        if(b>c){
            g=b;
        }
        else{
            g=c;
        }
    }

    System.out.println("Greatest among three number is "+g);

    if(a<b)
    {
        if(a<c)
        {
            s=a;
        }else{
            s=c;
             }
    }else{
        if(b<c){
            s=b;
        }
        else{
            s=c;
        }
    }
    System.out.println("Smallest among three number is "+s);
    diff=g-s;
    while(diff>0)
    {
        f=f*diff;
        diff--;
    }
    System.out.println("Facorial is "+f);
    }
}
    