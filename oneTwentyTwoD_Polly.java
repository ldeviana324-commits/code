import java.util.ArrayList;

public class oneTwentyTwoD_Polly {
    public static void main(String[] args){
        ArrayList<Double> list = new ArrayList<>();
        for(int i=-12; i <=16; i++){
            double y = (1*Math.pow(i,6)) + (-3*Math.pow(i,5)) + (-93*Math.pow(i,4)) + (87*Math.pow(i,3)) + (1596*Math.pow(i,2)) + (-1380*i) - 2800;
            list.add(y);
            System.out.println(y);
            
        }
        System.out.printf("%-30s %5s%n","x","y");
        for(int i = 0; i <29; i++){
            if(list.get(i)>=1000000){
                System.out.format("%-28d %1e%n",i-12,list.get(i));
            }
            else{
                System.out.format("%-30d %10s%n",i-12,list.get(i));
            }
        }

    }
}
