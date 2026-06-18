

//Data Types

/*
Primitive Data type:-
1.byte
2.short
3.char
4.boolean
5.int
6.long
7.float
8.double
*/


/*
Non primitive DataTypes
1.String
2.Array
3.Class
4.Object
5.Interface
*/


public class DataTypes {
    public static void main(String[] args) {
        // 1. byte: Stores very small whole numbers (-128 to 127)
        byte a = 8;
        System.out.println(a);


        // 2. char: Stores a single character (must use SINGLE quotes '')
        char b = 'a';
        System.out.println(b);

        // 3. boolean: Stores only true or false
        boolean c = true;
        System.out.println(c);

        // 4. float: Stores decimals (needs an 'f' at the end!)
        float d = 10.5f;
        System.out.println(d);

        // 5. int: Stores standard whole numbers (your go-to for numbers)
        int e = 25;
        System.out.println(e);

        // 6. long: Stores massive whole numbers (needs an 'L' at the end!)
        long f = 12345678901L;
        System.out.println(f);
        
        // 7. double: Stores large, precise decimals (no extra letter needed)
        double g = 99.99;
        System.out.println(g);
        
        // NEW. short: Stores small whole numbers (-32,768 to 32,767)
        short packageWeight = 450;
        System.out.println(packageWeight);
    }
}

//size of Data Types:- 1 byte=8bits

/*
byte:-1 byte                [128 to -128]
short:-2 byte               -32, 768 to 32 ,767
char:-2 byte                 0 to 65,535 (No negative numbers! It maps to characters via ASCII/Unicode)
boolean:-1 byte              Only true or false (No numerical range)
int:-4 byte                  Roughly -2 Billion to +2 Billion 
long:-8 byte                 Roughly -9 Quintillion to +9 Quintillion 
float:-4 byte                Up to 6 to 7 decimal digits of precision
double:-8 byte               Up to 15 to 16 decimal digits of precision
*/