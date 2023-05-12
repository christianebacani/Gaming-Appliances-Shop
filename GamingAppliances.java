import java.util.Scanner;
public class GamingAppliances {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int price[] = {200,350,500,500,200,350,800};
        int total = 0;
        boolean transaction = true;
        
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        while(transaction){
               
        System.out.print("     Buy a Gaming Appliances\n\n");
        System.out.print("APPLIANCES\t\tPrice\n");
        System.out.print("1.) Mouse \t\tP 200\n");
        System.out.print("2.) Keyboard\t\tP 350\n");
        System.out.print("3.) Monitor \t\tP 500\n");
        System.out.print("4.) Pc      \t\tP 500\n");
        System.out.print("5.) Headset \t\tP 200\n");
        System.out.print("6.) Controller\t\tP 350\n");
        System.out.print("7.) Gaming Chair\tP 800\n");
        
        System.out.print("Enter your choice here : ");
        int userChoice = input.nextInt();
        
        System.out.print("Enter the quantity here : ");
        int quantity = input.nextInt();
        
        total += price[userChoice - 1] * quantity;
        
        System.out.print("Do you want to buy more? (y/n): ");
        input.nextLine();
        String buyMore = input.nextLine();
        
        if(buyMore.equalsIgnoreCase("n")){
            
            transaction = false;
            System.out.print("The total price is : P " + total + "\n");
            System.out.print("Enter your payment here : ");
            int payment = input.nextInt();
            
            int change = payment - total;
            System.out.print("Change : P " + change + "\n");
            System.out.print("\n\nTHANK YOU FOR BUYING OUR GAMING APPLIANCES ^_^\n");
            
        }
        
        }
        
    }
}
