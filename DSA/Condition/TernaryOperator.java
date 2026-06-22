/*

Varaible=condition? statement 1 : Statement2?

*/


public class TernaryOperator{
    public static void main(String[] args) {
        int age=18;
        String type=(age>=18)? "Adult":"Not Adult";
        System.out.println(type);
    }
}