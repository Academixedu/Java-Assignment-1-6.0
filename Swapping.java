import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("Enter A");
        int a= sc.nextInt();
        System.out.println("Enter B");
        int b=sc.nextInt();
        int temp=0;
        System.out.println("Before swapping A is "+a);
        System.out.println("Before swapping B is "+b);

        temp=a;
        a=b;
        b=temp;
System.out.println("After the swapping A is "+a);
System.out.println("After the swapping B is "+b);
    }}
