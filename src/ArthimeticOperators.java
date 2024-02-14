import java.util.Scanner;

public class ArthimeticOperators {
    public static int addition(int a,int b){
        return a+b;
    }
    public static int subtraction(int a,int b){
        return a-b;
    }
    public static int multiplication(int a,int b){
        return a*b;
    }
    public static int division(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int addition = addition(a, b);
        System.out.println("Addition is :"+addition);

        int subtraction = subtraction(a, b);
        System.out.println("Subtraction is :"+subtraction);

        int multiplication = multiplication(a,b);
        System.out.println("Multiplication is "+multiplication);

        int division = division(a,b);
        System.out.println("Division is :"+division);
    }
}
