import java.util.*;

public class D07_Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.nextLine();
        System.out.println("Name : "+name);
        String name1 = sc.nextLine();
        System.out.println("Full name : "+name1);
        int num = sc.nextInt();
        System.out.println("Number : "+num);
        long num1 = sc.nextLong();
        System.out.println("Long Number : "+num1);
        sc.close();
    }
}