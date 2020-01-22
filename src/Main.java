import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        System.out.println("Hello World");

        //declare a string name y
        String y;
        //declare a boolean named EOO

        boolean evenOrOdd;

        //declare a int named maxNum and initialized it as 12
        int MaxNum = 12;

        //this is how you initialize an already declared variable
        y = "Hello World";
        System.out.println(y);
        System.out.print(MaxNum);
        evenOrOdd = true;
        System.out.println(evenOrOdd);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please tell me about your day: ");
        String input = sc.nextLine();
        System.out.println(input);
    }
}
