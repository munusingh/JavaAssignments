class Bitwiseaox
{
    public static void main(String args[])
    {
        int d1,d2,a,b,c;
        int n=Integer.parseInt(args[0]);
        d1=n%10;
        n=n/10;
        d2=n%10;
        n=n/10;
        d2=n%10;
        System.out.println("4th digit of four digit number is = "+d1);
        System.out.println("2nd digit of four digit number is = "+d2);
        a=d1 & d2;
        b=d1 | d2;
        c=d1 ^ d2;
        System.out.println("Bitwise AND is = "+a);
        System.out.println("Bitwise OR is = "+b);
        System.out.println("Bitwise XOR is = "+c);
        
    }
}