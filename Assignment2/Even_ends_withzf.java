import java.util.*;
class Even_ends_withzfa
{
    public static void main(String args[])
    {
      int count=0;
    for(int i=24;i<249;i++)
    {
        if(i%2==0 && i%10==0 || i%10==4)
         {
            count++;
         }
    }
    System.out.println("Numbers that satisfies given conditions are:"+count);
   }
}