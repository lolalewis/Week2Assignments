
public class SalaryTable {
  
    public static void main(String[] args) {
     
        int oldsalary;
        int raise=0;
        int newsalary=0;      
        //Headings
        System.out.format("%20s%20s%20s%20s\n","YEAR", "OLD SALARY", "RAISE", "NEW SALARY" );
        System.out.format("%20s%20s%20s%20s\n","----", "---------", "-----", "----------" );
        
        for (int year= 2; year < 10; year++) {
            
            oldsalary=40000;
            raise= (int)(oldsalary * .03);
            newsalary = oldsalary+raise;
            
            
            System.out.format("%20d%20d%20d%20d\n",year,oldsalary,raise,newsalary);
            
       
        
        
        
    }
    
}
}