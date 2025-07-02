const prompt = require("prompt-sync")();

let allItems = "";
let subtotalAllItems = 0;


let customerName = prompt("What is the the customer's Name?: ");

while (true) {

	let item = prompt("What did the user buy?: ");

	let quantity = prompt("How many pieces?: ");

	let price = prompt("How many per unit?: ");
	
	// mulitiply quantity * per price to get the total price of all the item

	let total = quantity * price;
	
	subtotalAllItems = subtotalAllItems + total;

	allItems = allItems + item + " x" + quantity + " =" + total + "\n";

	let more = prompt("Add more item? (yes or no)");
	
	if (more.toLowerCase() === "no") {
		break;

	
}

	}

	let cashierName = prompt("What is your name cashier?");
	
	let discountPercent = prompt("How much discount will he get?:");
	

	let discount = subtotalAllItems * discountPercent / 100;

	let vat = subtotalAllItems * 7.5 / 100;  //(VAT stands for value added tax)

	let totalBill = subtotalAllItems - discount + vat;

	
	let amountPaid = prompt("How much did the customer give you?");
	
	let balance = amountPaid - totalBill;



	console.log("\n================ INVOICE ================");
	console.log("Customer Name: " + customerName);
	console.log("Cashier Name: " + cashierName);
	console.log("Items Bought:\n" + allItems);
	console.log("Sub Total All Items: " + subtotalAllItems);
	console.log("Discount: " + discount);
	console.log("VAT: " + vat);
	console.log("Total Bill: " + totalBill);
	console.log("Amount Paid: " + amountPaid);
	console.log("Balance: " + balance);
	console.log("=========================================");
	console.log("THANKS YOU FOR YOUR PATRONGE");



