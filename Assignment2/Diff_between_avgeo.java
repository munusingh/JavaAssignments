class Diff_between_avgeo
{ 
    public static void main(String args[])
    {
         int a,b,c,d,p,q,r,s,t,u,temp,sum1=0,sum2=0,count1=0,count2=0,even,odd;
         float avg,avg1,avg2;
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
    
         for(int i=0 ;i<args.length;i++)
         {  
            temp=Integer.parseInt(args[i]);
            if(temp%2!=0)
            {odd=Integer.parseInt(args[i]);
            System.out.println("odd numbers are :"+args[i]);
            sum1=sum1+odd;
            count1++;
            }
         }
         for(int i=0 ;i<args.length;i++)
         {  
           temp=Integer.parseInt(args[i]);
            if(temp%2==0)
            {even=Integer.parseInt(args[i]);
            System.out.println("Even numbers are :"+args[i]);
            sum2=sum2+even;
            count2++;
            }
         }
      avg1=sum1/count1;
      avg2=sum2/count2;
      avg=avg1-avg2;
      System.out.println("no of odd is:"+count1);
      System.out.println("no of even is:"+count2);
      System.out.println("sum of odd is:"+sum1);
      System.out.println("sum of even is:"+sum2);
      System.out.println("avg of odd is:"+avg1);
      System.out.println("avg of even is:"+avg2);
      System.out.println("Difference of average is:"+avg);
      


        }
    }
