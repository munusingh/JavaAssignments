import java.util.*;
class Ass3_arr6
{
    public static void main(String args[])
    {
        int i,j,l,m,n;
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
        l=(A[1][1]*A[2][2])-(A[2][1]*A[1][2]);
        m=(A[1][0]*A[2][2])-(A[2][0]*A[1][2]);
        n=(A[1][0]*A[2][1])-(A[2][0]*A[1][1]);

       int det=(A[0][0]*l)-(A[0][1]*m)+(A[0][2]*n);
       System.out.println("The Determinant of 3*3 matrix = "+det);
       if(det!=0)
       {
        B[0][0]=((B[1][1]*B[2][2])-(B[1][2]*B[2][1]));
        B[0][1]=((B[0][1]*B[2][2])-(B[0][2]*B[2][1]));
        B[0][2]=((B[0][1]*B[1][2])-(B[0][2]*B[1][1]));
        B[1][0]=((B[1][0]*B[2][2])-(B[1][2]*B[2][0]));
        B[1][1]=((B[0][0]*B[2][2])-(B[0][2]*B[2][0]));
        B[1][2]=((B[0][0]*B[1][2])-(B[0][2]*B[1][0]));
        B[2][0]=((B[1][0]*B[2][1])-(B[1][1]*B[2][0]));
        B[2][1]=((B[0][0]*B[2][1])-(B[0][1]*B[2][0]));
        B[2][2]=((B[0][0]*B[1][1])-(B[0][1]*B[1][0]));
        for( i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                B[i][j] /= det;
                if(B[i][j] == 0) B[i][j] = 0;
            }
        }
        System.out.println("Inverse of matrix is:");
        for( i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(B[i][j]+" "); 
            }
            System.out.println( ); 
        }

       }
       else{
        System.out.println("can't invert this matrix!");
       }
    }
}
