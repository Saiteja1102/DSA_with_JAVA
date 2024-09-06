import java.util.*;

public class D10_Area_of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle : ");
        double radius = sc.nextDouble();

        double area = 3.14*radius*radius;
        System.out.println("The area of Circle : "+area);
        sc.close();
    }
}
