
public class oneSixtySix_Wages {
    
    public static void main(String[] args) {
        int wage = 4;

        
        for (int i = 3; i <= 6; i++){
            System.out.println("");
            System.out.println("Wages for "+ i +" employees");
            System.out.println("");
            for(int j = 10; j <= 40; j +=10 ){
                int dollars = i*j*wage;
                System.out.println("For " + String.valueOf(j) + " hours worked, the wages are " + String.valueOf(dollars)+ " dollars");
            }
        
    }
} 
}