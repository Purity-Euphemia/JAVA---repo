def atm_card(card_number):
    issuer = "Unknown"
    is_valid = False

    
    count = 0
    for _ in card_number:
        count += 1

    
    if card_number[0] == 5 and count == 16:
        issuer = "Mastercard"
    elif card_number[0] == 6 and count == 16:
        issuer = "Discover"
    elif card_number[0] == 3 and count == 16:
        issuer = "America Express"
    elif card_number[0] == 4 and count == 16:
        issuer = "Visa"

    sum1 = 0
    sum2 = 0

   
    index = count - 2
    while index >= 0:
        product = card_number[index] * 2
        if product > 9:
            product = product // 10 + product % 10
        sum1 += product
        index -= 2

    index = count - 1
    while index >= 0:
        sum2 += card_number[index]
        index -= 2

    total = sum1 + sum2
    is_valid = (total % 10 == 0)

    print("Issuer:", issuer)
    print("Valid:", is_valid)



card_number = [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4]
atm_card(card_number)
