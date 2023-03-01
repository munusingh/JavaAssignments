
 class Diff_lar_sma
 { 
    public static void main(String args[])
    {
         int a,b,c,d,p,q,r,s,t,u,temp,diff;
         a=Integer.parseInt(args[0]);
         b=Integer.parseInt(args[1]);
         c=Integer.parseInt(args[2]);
         d=Integer.parseInt(args[3]);
         p=Integer.parseInt(args[4]);
         q=Integer.parseInt(args[5]);
         r=Integer.parseInt(args[6]);
         s=Integer.parseInt(args[7]);
         t=Integer.parseInt(args[8]);
         u=Integer.parseInt(args[9]);
         int max=Integer.parseInt(args[0]);
         int min=Integer.parseInt(args[0]);
         for(int i=1 ;i<args.length;i++)
         {   temp=Integer.parseInt(args[i]);
             if(temp>max)
             {max=Integer.parseInt(args[i]);}
             else if(temp<min)
             {min=Integer.parseInt(args[i]);}
             
         }
      System.out.println("Largest among 10 number is:"+max);
      System.out.println("Smallest among 10 number is:"+min);
      diff=max-min;
      System.out.println("Difference is:"+diff);

    }
 }