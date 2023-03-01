class Findpos
{  
  public static void main(String args[])
  {
    int a,b,c,d;
    int n=Integer.parseInt(args[0]);
    a=n/1000;
    n=n%1000;
    b=n/100;
    n=n%100;
    c=n/10;
    n=n%10;
    d=n;
    System.out.println(" value available 1000th position is " +a);
    System.out.println(" value available 100th position is " +b);
    System.out.println(" value available 10th position is " +c);
    System.out.println(" value available 1st position is " +d);
  }
}