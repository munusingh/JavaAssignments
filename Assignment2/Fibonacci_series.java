import java.util.Scanner;
public class  Fibonacci_series
{
 public static void main(String args[])
{
 int n,fib1=0,fib2=1,sum=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter value of n:");
 n=sc.nextInt();
 
 System.out.println("Fibonacci series till "+n+" terms: ");
 while(sum<=n)
 {
    System.out.print(sum+" ");
     fib1=fib2;
     fib2=sum;
     sum=fib1+fib2;
 }

}

}