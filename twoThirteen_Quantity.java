import java.util.Scanner;

public class twoThirteen_Quantity {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double costPer = 5.95;
    for(int i = 0; i<4 ; i++){
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        if(quantity<=99){
            costPer = 5.95;}
        else if(quantity>=100 && quantity<=199){
            costPer = 5.75;}
        else if(quantity>=200 && quantity<=299){
            costPer = 5.40;}
        else if(quantity>=300){
            costPer = 5.15;}
        String amountDue = String.format("%.2f",quantity*costPer);

        System.out.println("Price: " + String.valueOf(costPer));
        System.out.printf("%s %s", "Amount due: ",String.valueOf(amountDue));
        System.out.println(" \n");
    input.close();
    }

    }

}