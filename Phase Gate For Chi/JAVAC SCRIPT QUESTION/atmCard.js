function atmCard(cardNumber) {

    let issuer = "Unknown";
    let isValid = false;
    const count = cardNumber.length;

    
    if (cardNumber[0] === 5 && count === 16) {
        issuer = "Mastercard";
    } else if (cardNumber[0] === 6 && count === 16) {
        issuer = "Discover";
    } else if (cardNumber[0] === 3 && count === 16) {
        issuer = "America Express";
    } else if (cardNumber[0] === 4 && count === 16) {
        issuer = "Visa";
    }

    
    let sum1 = 0;
    let sum2 = 0;

    
    for (let count = cardNumber.length - 2; count >= 0; count -= 2) {
        let product = cardNumber[count] * 2;
        if (product > 9) {
            product = Math.floor(product / 10) + (product % 10);
        }
        sum1 += product;
    }

    
    for (let count = cardNumber.length - 1; count >= 0; count -= 2) {
        sum2 += cardNumber[count];
    }

    const total = sum1 + sum2;
    isValid = (total % 10 === 0);

    
    console.log("Issuer:", issuer);
    console.log("Valid:", isValid);
}


const cardNumber = [5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4];
atmCard(cardNumber);
