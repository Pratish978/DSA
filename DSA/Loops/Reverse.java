public class Reverse {
    public static void main(String[] args) {
        int n=12345;

        while (n>0) {
            int LD=n%10;
            System.out.print(LD);
            n=n/10;
        }
    }
}
