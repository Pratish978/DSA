import java .util.*;

public class Sqaure {
    public static void main(String[] args) {
        System.out.println("Enter side of Sqaure");
        Scanner sc=new Scanner(System.in);
        int side =sc.nextInt();
        int sqaue=side*side;
        System.out.println(sqaue);
        sc.close();
    }
}
