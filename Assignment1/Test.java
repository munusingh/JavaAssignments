class Test 
{
  public static void main(String args[])
  {
    int s=0,d=0;
    int n= Integer.parseInt(args[0]);
    d=n%10;
    s=s+d;
    n=n/10;
    d=n%10;
    s=s+d;
    n=n/10;
    d=n%10;
    s=s+d;
    n=n/10;
    s=s+n;
    System.out.println("sum = " +s);
  }

}