all_items = ""
subtotal_all_items = 0


customer_name = input("What is the the customer's Name?: ")

while True: 

	item = input("What did the user buy?: ")

	quantity = int(input("How many pieces?: "))

	price = float(input("How many per unit?: "))
	
	# mulitiply quantity * per price to get the total price of all the item

	total = quantity * price
	
	subtotal_all_items = subtotal_all_items + total

	all_items = all_items + f"{item} x {quantity} = {total}\n"

	more = input("Add more item? (yes or no)")
	
	if more.lower() == "yes":
		continue
	else:		
		cashier_name = input("What is your name cashier?")
	
		discount_percent = float(input("How much discount will he get?:"))
	

		discount = subtotal_all_items * discount_percent / 100;

		vat = subtotal_all_items * 7.5 / 100;  #(VAT stands for value added tax)

		total_bill = subtotal_all_items - discount + vat

	
		amount_paid = float(input("How much did the customer give you?"))
	
		balance = amount_paid - total_bill;



		print("\n================ INVOICE ================")
		print("Customer Name: ", customer_name)
		print("Cashier Name: ", cashier_name)
		print("Items Bought:", all_items)
		print("Sub Total All Items: ", subtotal_all_items)
		print("Discount: ", discount)
		print("VAT: ", vat)
		print("Total Bill: ", total_bill)
		print("Amount Paid: ", amount_paid)
		print("Balance: ", balance)
		print("=========================================")
		print("THANKS YOU FOR YOUR PATRONGE")
	





















	
	
