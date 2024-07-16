import java.util.Scanner;
public class SwapScan {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Before Swapping : "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping : "+a+" "+b);
        s.close();
    }
    
}
