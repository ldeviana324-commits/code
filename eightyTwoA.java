import java.util.Scanner;

public class eightyTwoA {
    static int fineCost(int speedLimit, int vehicleSpeed) {
        if (speedLimit<vehicleSpeed){
        int fine = 20 + ((vehicleSpeed-speedLimit)*5);
        return fine;
        }
        else{
        return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the speed limit: ");
        int  speedLimit = input.nextInt();

        System.out.print("Enter the vehicle speed: ");
        int vehicleSpeed = input.nextInt();

        System.out.println("Fine--------------------$" + fineCost(speedLimit,vehicleSpeed));
        
        input.close();
    }


}
