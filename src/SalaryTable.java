
public class SalaryTable {
  
    public static void main(String[] args) {
     
        int start=40000;
        int increase;       
        int finish;
        int raise=0;
        //Headings
        System.out.format("%20s%20s%20s%20s\n","YEAR", "OLD SALARY", "RAISE", "NEW SALARY" );
        System.out.format("%20s%20s%20s%20s\n","----", "---------", "-----", "----------" );
        
        for (int year = 1; year < 10; year++) {
            System.out.format("%d%20d",year, start);
            increase = (int)(start * 0.03);
            start+=increase;
            raise= start-increase;
            finish= start+increase;
           
            System.out.format("%10d%10d%10d%10d",year,start,increase,finish);
        }
        
        
    }
    
}
