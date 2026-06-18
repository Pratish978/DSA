public class typeCasting{
    public static void main(String[] args) {
        float a=25.12f;
        int b=(int)a;
        System.out.println(b);//25
    }
}

//That is Type Casting (also known as Narrowing Conversion)

/*
When you force a floating-point number (float or double) into an 
integer (int), Java does not round the number to the nearest whole value. 
Instead, it performs truncation.
*/