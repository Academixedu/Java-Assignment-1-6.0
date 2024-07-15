import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value a:");
        int a=sc.nextInt();
        System.out.println("enter value b:");
        int b=sc.nextInt();
        // a=a+b;
        // b=a-b;
        // a=a-b;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping values of a and b are:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        sc.close();
    }
    
}

