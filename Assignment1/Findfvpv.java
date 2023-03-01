class Findfvpv
{  
  public static void main(String args[])
  {
    int a,b,c,d,e,f,g;
    int n=Integer.parseInt(args[0]);
    a=n/1000;
    e=(n/1000)*1000;
    n=n%1000;
    b=n/100;
    f=(n/100)*100;
    n=n%100;
    c=n/10;
    g=(n/10)*10;
    n=n%10;
    d=n;
    System.out.println("face value of 1000th place is " +a);
    System.out.println("face value of 100th place is " +b);
    System.out.println("face value of 10th place is " +c);
    System.out.println("face value of 1st place is " +d);
    System.out.println("place value of 1000th place is " +e);
    System.out.println("place value of 100th place is " +f);
    System.out.println("place value of 10th place is " +g);
    System.out.println("face value of 1st place is " +d);
   
  }
}