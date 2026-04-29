import java.util.Scanner;

public class oneSixtyTwoH_Guest {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int possibleCombinations = 1;
        System.out.print("Guests: ");
        int  guests = input.nextInt();

        System.out.print("Chairs: ");
        int chairs = input.nextInt();

        for(int i=0; i< chairs; i++){
            possibleCombinations *= guests;
            guests -= 1;
        }
        System.out.println("permutations: "+ possibleCombinations);
        System.out.println("Guests standing: "+ String.valueOf(chairs-guests));
        input.close();
    }


}

