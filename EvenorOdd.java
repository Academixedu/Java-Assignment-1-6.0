import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        if(n%2!=0){
            System.out.println(n+" is odd number");
        }
        else
            System.out.println(n+" is even number");
            sc.close();
    }
    
}
