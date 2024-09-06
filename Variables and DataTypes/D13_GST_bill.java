import java.util.*;

public class D13_GST_bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of pencil : ");
        float Price_Pencil = sc.nextFloat();
        System.out.print("Enter the price of pen : ");
        float Price_Pen = sc.nextFloat();
        System.out.print("Enter the price of eraser : ");
        float Price_Eraser = sc.nextFloat();

        System.out.println("-----------------------------");
        System.out.println("---- Bill ----");
        System.out.println("Pencil = "+Price_Pencil);
        System.out.println("Pen = "+Price_Pen);
        System.out.println("Eraser = "+Price_Eraser);
        float Total = Price_Pencil+Price_Pen+Price_Eraser;
        System.out.println("Total Price = "+Total);
        System.out.println("-----------------------------");

        System.out.println("-----------------------------");
        System.out.println("-- GST Bill --");
        System.out.println("Pencil = "+Price_Pencil);
        System.out.println("Pen = "+Price_Pen);
        System.out.println("Eraser = "+Price_Eraser);
        float GST = (Price_Pencil+Price_Pen+Price_Eraser)*18/100;
        float GST_Price = Total+GST;
        System.out.println("GST Price = "+GST_Price);
        System.out.println("-----------------------------");
        sc.close();
    }
}
