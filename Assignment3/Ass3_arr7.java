import java.util.*;
class Ass3_arr7
{
    public static void main(String args[])
    {
        int i,j;
        int A[][]=new int[3][3];
        int B[][]=new int[3][3];
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter elements of matrix A");
        for( i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                A[i][j]=Sc.nextInt();
            }
        }
        System.out.println("Transpose of matrix A is:");
        for( i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {    
                B[i][j]=A[j][i];
            }
        }
        for( i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {    
                System.out.print(B[i][j]+" ");   
            }
            System.out.println();
        }
    }
}