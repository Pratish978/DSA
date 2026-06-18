import java.util.*;

public class gst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter price of Pencil");
        float pencil=sc.nextFloat();
        System.out.println("Enter price of Pen");
        float pen=sc.nextFloat();
        System.out.println("Enter price of Eraser");
        float Eraser=sc.nextFloat();

        float total=pencil+pen+Eraser;
        System.out.println(total);

        //Add on with 18%gst
        float newTotal=total+(0.18f*total);
        System.out.println(newTotal);
        sc.close();
    }
}
