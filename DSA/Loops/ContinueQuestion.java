import java.util.*;

public class ContinueQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers (Type -1 to exit):");
        
        do {
            System.out.println("Enter your Number:");
            int n = sc.nextInt();

            // Option to break the loop
            if (n == -1) {
                break; 
            }

            if (n % 10 == 0) {
                System.out.println("Multiple of 10 detected! Skipping...");
                continue;
            }
            
            System.out.println("Number was : " + n);
        } while (true); 
        
        // Now this is reachable after the loop breaks
        sc.close();
        System.out.println("Scanner closed. Program finished.");
    }
}