
public class fiftyNineB_Rounding {
    
    public static void main(String[] args) {

        int max = 20;
        int min = -20;
        double[] originalNum = new double[16];
        double[] roundedNum = new double[16];
        
        for (int i = 0; i <= 15; i++){
            double value = Math.random() * (max - min) + min;
            double roundedValue = Math.round(value * 1000.0)/1000.0;
            originalNum[i] = value;
            roundedNum[i] = roundedValue;
            
        }
        System.out.printf("%-15s%-30s%s","#","Original","Rounded\n");
        for(int i = 1; i <roundedNum.length; i++){
            System.out.format("%-15d%-30s%.3f%n",i,originalNum[i],roundedNum[i]);
        }
        
        
        
    }
} 
