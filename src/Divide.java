import java.util.Scanner;

public class Divide {
 
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int num1,num2;
      int remain ;
        System.out.print("Enter an Interger ");
        num1 =s.nextInt();
         System.out.print("Enter an Interger ");
        num2=s.nextInt();
        
        System.out.format("%d" + (num1%num2));
    }
    
}
