/* 
1.Java automatically promotes each byte, short or char operand to int when evaluating an expression
2.if one operand is long,float or double the whole expression is promoted to long,float or double respectively.
*/


public class typePromotion {
    public static void main(String[] args) {
        char a='a';//char is converted into int
        char b='b';//char is converted into int
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b-a);


        int c=10;
        float d=20.25f;
        long e=25;
        double f=30;
        double ans=c+d+e+f;//All converted to double 
        System.out.println(ans);
    }
}
