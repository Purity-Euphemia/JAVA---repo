import java.util.Scanner;
public class SampleCheckout {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);



	System.out.println("What is the the customer's Name?: ");
	String customerName = input.nextLine();

	
	String allItems = "";
	double subtotalAllItems = 0;

	while(true) {

	System.out.println("What did the user buy?: ");
	String item = input.next();

	System.out.println("How many pieces?: ");
	int quantity = input.nextInt();


	
	System.out.println("How many per unit?: ");
	double price = input.nextDouble();
	
	// mulitiply quantity * per price to get the total price of all the item

	double total = quantity * price;
	
	subtotalAllItems = subtotalAllItems + total;
	
	allItems = allItems + item + " x" + quantity + " =" + total + "\n";

	System.out.println("Add more item? (yes or no)");
	String more = input.next();

	if (more.equals("no")) {
                System.out.println("Thank you so much!");
                	break; 
            } else if (more.equals("yes")) {
                System.out.println("Continuing ...");

	}

}


	System.out.println("What is your name cashier?");
	String cashierName = input.next();

	System.out.println("How much discount will he get?:");
	double discountPercent = input.nextDouble();

	double discount = subtotalAllItems * discountPercent / 100;

	double vat = subtotalAllItems * 7.5 / 100;  //(VAT stands for value added tax)

	double Totalbill = subtotalAllItems - discount + vat;

	
	System.out.println("How much did the customer give you?");
	double amountPaid = input.nextDouble();

	double balance = amountPaid - Totalbill;



	System.out.println("\n================ INVOICE ================\n");
	System.out.println("Customer Name: " + customerName);
	System.out.println("Cashier Name: " + cashierName);
	System.out.println("Items Bought:");
	System.out.println(allItems);
	System.out.println("Sub Total All Items: " + subtotalAllItems);
	System.out.println("Discount: " + discount);
	System.out.println("VAT: " + vat);
	System.out.println("Total Bill: " + Totalbill);
	System.out.println("Amount Paid: " + amountPaid);
	System.out.println("Balance: " + balance);
	System.out.println("\n=========================================\n");
	System.out.println("THANKS YOU FOR YOUR PATRONGE");


















































}
}