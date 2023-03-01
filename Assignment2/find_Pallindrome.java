import java.util.*;
class find_Pallindrome
{
public static void main(String args[])
    {
        int count=0,d,r,s;
        for(int i=24;i<249;i++)
        {   s=0;
            d=i;
        while(d>0)
        {
            r=d%10;
            s=s*10+r;
            d=d/10;
        }
        if(i==s)
        {
          count++;
        }
        }
        
        System.out.println("Pallindrome Numbers in between 23 to 249 are:"+count);
    }
 }