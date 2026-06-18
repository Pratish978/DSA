//Input in java
/*
next
nextInt
nextLine
nextByte
nextFloat
nextDouble
nextBoolean
nextShort
nextLong
*/


import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number");
        int a=sc.nextInt();
        System.out.println("Enter Second number");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum:-"+ sum);

        sc.close();
    }
}

/*
Import:-The import keyword tells Java:
        "Hey, I want to bring a specific tool or folder of tools into this program."

java:- is the main root folder.

.util:- (short for utility) is a sub-folder inside it. 
        This folder contains incredibly useful helper tools like Scanner (for reading inputs), 
        ArrayList (for making dynamic lists), Random (for generating random numbers), and many others.

* :- When you put .* at the end, you are telling Java: 
     "Import every single tool inside the java.util folder all at once."

If you don't explicitly write sc.close();, that pipe stays open in the background wasting a tiny bit 
of your computer's system memory (a "resource leak") until the entire program completely shuts down.
Closing it tells Java, "I am officially done listening to the keyboard, you can close this pipe and 
reclaim the memory."
*/
