import java.util.Scanner;

public class Divide {
 
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int num1,num2;
      int remain ;
      int quotient;
        System.out.print("Enter an Interger ");
        num1 =s.nextInt();
         System.out.print("Enter an Interger ");
        num2=s.nextInt();
       
       quotient=num1>num2? num1/num2 : num2/num1;
       remain=num1>num2? num1%num2 : num2%num1;
              
        System.out.format("The answer is %d Remainder %d" ,quotient,remain );
        
    }
    
}
