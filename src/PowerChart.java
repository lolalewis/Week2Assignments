import java.util.Scanner;

public class PowerChart {
  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1=0;
       
        System.out.print("Enter a number 0->10: ");
        num1 = s.nextInt();
        //format
        System.out.format("%20s%20s\n", "X", "2^X");
        System.out.format("%21s%19s\n","--", "---");
        
        for (int i = 0; i <= 10; i++) {
            
            System.out.println(Math.pow(2,num1));
          
            System.out.println("");
                      
        }
        
        
        
        
            
    }
    
}
