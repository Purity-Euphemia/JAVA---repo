print("WELCOME_TO__PHONE_BOOK_APP")
print("LIST OF MENU FUNCTIONS")

contacts = [] 

while True:
	print("""
MENU
	1. Add contact.
    	2. Remove contact.
    	3. Find contact by first name.
    	4. Find contact by last name.
    	5. Edit contact.

    	""")
	choice = input('Enter your choice (1 to 5): ')

	if choice == "1":
		print("ADD CONTACT")
		name_first = input("Enter the first name: ")
		name_last = input("Enter the second name: ")
		number = input("Enter the phone number: ")
		contact = [name_first, name_last, number]
		contacts.append(contact)
		print("Contact successfully added")
	
	elif choice == "2":
		print("REMOVE CONTACT")
		name_to_remove = input("Enter name to remove: ")
		removed = False
		for contact in contacts:
			if contact[0] == name_to_remove:
				contacts.remove(contact)
				print(contacts)
				print("Contact removed")
				removed = True
				break
	
			
				


