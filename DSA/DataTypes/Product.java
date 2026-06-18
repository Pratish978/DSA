import java.util.*;

public class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b=sc.nextInt();
        int Product=a*b;
        System.out.println("Product:-"+ Product);

        sc.close();
    }
}
