import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Before swap the number are "+a   +","+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap the number are "+a+","+b);
        

    }
}