import java.util.Scanner;
interface Number 
{
    public boolean checkNumber(int number) throws NotCheckNumberException;
}
class NotCheckNumberException extends Exception
{
    NotCheckNumberException(String error)
    {
        super(error);
    }
}
public class Assign_P3 implements Number{
    public static void main(String[] args) throws NotCheckNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        Assign_P3 obj=new Assign_P3();
        System.out.println(obj.checkNumber(number));
    }
    @Override
    public boolean checkNumber(int number) throws NotCheckNumberException {
        // here check wheather number is palidrome or not
        if (number % 3 == 0 || number % 5 == 0) {
            if (isPalindrome(number)) {
                return true;
            }
        } 
        else {
            throw new NotCheckNumberException("It is not palindrome number and not divisible by 3 or 5");
        }
        return false;
    }

    public boolean isPalindrome(int number) {
        int temp = number, rem = 0, sum = 0;
        while (temp > 0) {
            rem = temp % 10;
            sum = sum * 10 + rem;
            temp = temp / 10;
        }
        if (number == sum) {
            return true;
        }
        return false;
    }
}
