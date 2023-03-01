class Pyramid
{
  void pattern(int n)
  {
    if(n%2==0) //For Even Number
    {
      int i=0;
      for(int row=1;row<5;row++)
      {
        for(int space =1;space<5-row;space++)
        {
          System.out.print(" ");
        }
        for(int col=1;col<=row;col++)
        {
          System.out.print(n+((col*i)+2)+" ");
        }
        i=i+2;
        System.out.println();
      }
    }
    else
    {
      int i=1; //For Odd Number
      for(int row=1;row<5;row++)
      {
        for(int space =1;space<5-row;space++)
        {
          System.out.print(" ");
        }
        for(int col=1;col<=row;col++)
        {
          System.out.print(n+(col*i)+" ");
        }
        i=i+3;
        System.out.println();
      }
    }
  }
  void pattern(char k)
  {
    for(int row=1;row<5;row++)
    {
      for(int space =1;space<5-row;space++)
      {
        System.out.print(" ");
      }
      for(int col=1;col<=row;col++)
      {
        System.out.print(k+" ");
      }
      System.out.println();
    }
  }
}

public class Ass3_poly2
{
    public static void main(String[] args) 
    {
      Pyramid p = new Pyramid();
      p.pattern(2);
      p.pattern(3);
      p.pattern('K');
    }
}
