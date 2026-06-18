import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number");
        int b=sc.nextInt();
        System.out.println("Enter Third Number");
        int c=sc.nextInt();

        int Avg=a+b+c/3;
        System.out.println("Average of # numers are :"+ Avg);
        sc.close();
    }
}
