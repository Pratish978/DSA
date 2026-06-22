import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number a ");
        int a=sc.nextInt();
        System.out.println("Enter Number b ");
        int b=sc.nextInt();
        System.out.println("Enter any operator : + - * / ");
        int operator=sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                break;
        }
        sc.close();
    }
}
