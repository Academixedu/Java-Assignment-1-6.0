import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) 
    {
        int a=3;
        int b=45;
        int temp;
        System.out.println(" Before Swap your Number a = "+a);
        System.out.println(" Before Swap your Number b = "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println(" After Swap your Number a = "+a);
        System.out.println(" After Swap your Number b = "+b);
        Swapping obj= new Swapping();
        obj.newmethod();
        
    }
     public  void newmethod() 

     {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Before Swap Enter Number a = ");
        int a=sc.nextInt();
        System.out.print(" Before Swap Enter Number b = ");
        int b=sc.nextInt();
        a=a+b;
        b=a-b; 
        a=a-b;
        System.out.println("After swap a = "+a);
        System.out.println("After swap b = "+b);

     }

   }

    
