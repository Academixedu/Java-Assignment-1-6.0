import java.util.Scanner;
public class SwappingNumbers {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int a = s1.nextInt();
        System.out.println("Entered value of the first number is: "+a);
        System.out.println("Please enter the second number:");
        int b = s1.nextInt();
        System.out.println("Given value of the second number is: "+b);

        //swapping of the numbers using two variables

        a= a+b;
        //Here the value of the "a" has been changed
        System.out.println("The value of 'a' here after performing an operation is: "+a);
        //Operation to perform swapping
        b= a-b;
        System.out.println("The new value of the 'b' is: "+b);
        //The value of A
        a=a-b;
        System.out.println("The new value of 'a' is: "+a);



    }
    
}
