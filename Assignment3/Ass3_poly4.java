public class Ass3_poly4 {
    public static void main(String[] args) {
    System.out.println("Simple Interest : "+interest(1000, 2, 5));
    System.out.println("Compound Interest : "+interest(1000, 2, 5, 12));
    }
    public static double interest(double p , double t , double r){
    return (p*t*r)/100;
    }
    public static double interest(double p , double t , double r , int n){
    return (p*Math.pow((1+r/100),n))-p;
    }
}
    
