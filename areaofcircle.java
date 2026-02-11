import java.util.Scanner;

public class areaofcircle {

    static final double PI = 3.1459;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the radius:");
        double radius = s.nextDouble();

        double area = PI * radius * radius;

        System.out.println("Area of Circle: " + area);

        s.close();
    }
}
