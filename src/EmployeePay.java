import java.util.Scanner;

public class EmployeePay {
 
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      final double  WAGE=15,overtime=22.50;
      int hours=0;
      double totalpay,pay=0; 
      ;
      //5 employees
        for (int i = 0; i <= 5; i++) {
             System.out.print("Enter hours worked for Employee " + (i+1) );
             hours = s.nextInt();
             
        }while(hours>40){
        pay = hours*overtime;     
       
      
      
    }
    
}
}