import java.util.Arrays;
import java.util.Scanner;

interface PriFi
{
    void input();
}
class First implements PriFi {
    int a = 0, b = 1, c = 0, n, k = 0;
    Scanner sc = new Scanner(System.in);
    @Override
    public void input()
    {
        System.out.println("Enter Number of terms");
        n = sc.nextInt();
        System.out.println(" list of prime Fibonacci series between user defined range");
        // System.out.print(a +"\t");
        // System.out.print(b +"\t");
        c = a + b;
        a = b;
        b = c;
        // System.out.print(c +"\t");
        for (int i = 4; i <= n; i++) {
            c = a + b;
            if (c > n) {
                break;
            } else {
                for (int j = 1; j <= c; j++) {
                    if (c % j == 0) {
                        k++;
                    }
                }
                if (k == 2) {
                    System.out.print(c +"\t");
                }
                a = b;
                b = c;
                k = 0;

            }
        }
    }



}
public class Assign_P1 {
    public static void main(String[] args) {
        PriFi ob=new First();
        ob.input();


    }

}
