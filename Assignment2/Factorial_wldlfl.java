import java.util.*;
class Factorial_wldlfl
 {
    public static void main(String args[])
    {  
        int f=1,n,m,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        m=sc.nextInt();
   switch(c)
    {
    case 0:
         f=1;
         n=m;
         while(n>0)
        {
           f=f*n;
           n=n-1;
        }
    System.out.println("Factorial of "+m+" using While loop is "+f);
    case 1:
        f=1;
        n=1;
        do
        {
            f=f*n;
            n=n+1;
        }while(n<=m);
    System.out.println("Factorial of "+m+" using do While loop is "+f);

    case 2:
       f=1;
       n=m ;
       for(n=1;n<=m;n++)
       {
        f=f*n;
       }
    
    System.out.println("Factorial of "+m+" using for loop is "+f);
    }
    }
}
