import java.util.*;
class Ass3_arr5
{
    public static void main(String args[])
    {
        int i,j;
        int A[][]=new int[3][4];
        int B[][]=new int[3][4];
        int C[][]=new int[3][4];
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter elements of matrix A");
        for( i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                A[i][j]=Sc.nextInt();
            }
        }
        System.out.println("Enter elements of matrix B");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                B[i][j]=Sc.nextInt();
            }
        }
        System.out.println("Summation is:");
        for( i=0;i<3;i++)
        {
            for( j=0;j<3;j++)
            {
                C[i][j]=0;
                {
                    C[i][j]+=A[i][j]+B[i][j];
                }
             System.out.print(C[i][j]+" ");
            }
            System.out.println(" "); 
        }

        System.out.println("Subtraction is:");
        for( i=0;i<3;i++)
        {
            for( j=0;j<3;j++)
            {
                C[i][j]=0;
                {
                     C[i][j]+=A[i][j]-B[i][j];
            }
             System.out.print(C[i][j]+" ");
            }
            System.out.println(" "); 
        }
        System.out.println("Multiplication is:");
        for(i=0;i<3;i++)
        {
          for(j=0;j<3;j++)
            {
               C[i][j]=0;
               for(int k=0;k<3;k++)
               {
                C[i][j]+=A[i][k]*B[k][j];
               }
             System.out.print(C[i][j]+" ");
            }
            System.out.println(" "); 
        }


    }
}
        
    

