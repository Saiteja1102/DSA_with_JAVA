import java.util.*;

public class D12_Area_Of_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Square : ");
        float side = sc.nextFloat();

        float area = side*side;
        System.out.println("The area of square : "+area);
        sc.close();
    }
}
