// program for finding area of circle
import java.util.Scanner;

public class AreaOfCircle {
    public static void areaOfCircle(double r){
        double area=3.14 * r * r;
        System.out.println("Area of circle is :"+area);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle for finding the area :");
        double a = sc.nextInt();
        areaOfCircle(a);
    }
}
