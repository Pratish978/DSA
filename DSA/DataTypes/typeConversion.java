//Coversion happens when:-
//a.type compatible
//b.destination type > source type

//byte -> short -> int -> float -> long -> double.

public class typeConversion{
    public static void main(String[] args) {
        int a=25;
        long b=a;
        System.out.println(b);//It is valid

        // long a=25;
        // int b = a;
        // System.out.println(b); // it is not valid because nt is 4 bit and long is 8 bit.

    }
}