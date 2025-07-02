function ATMCardCheack(array) {
	let mastercard = {
	valid: true,
	issuer: "Mastercard",
  };
	
	let discover = {
    	valid: true,
    	issuer: "Discover",
  };

  	let AmericaExpress = {
	valid: true,
    	issuer: "American Express",
  };

  	let visa = {
    	valid: true,
    	issuer: "Visa",
  };

  	let invalid = {
    	valid: false,
    	issuer: "Invalid",
  };

  
  let totalStep2 = 0; // Doubled values
  let totalStep3 = 0; // Odd positions (not doubled)
  let length = array.length;

  // Step 1 + 2: Double every second digit from the right and fix if needed
  for (let count = length - 2; count >= 0; count -= 2) {
	let digit = array[count];
    	let doubled = digit * 2;

    	if (doubled > 9) {
		doubled = doubled - 9;
    }

   	 totalStep2 += doubled;
  }

  // Step 3: Add the remaining digits (those not doubled)
  for (let count = length - 1; count >= 0; count -= 2) {
    	totalStep3 += array[count];
  }

 
  let total = totalStep2 + totalStep3;

  // Step 5: Check validity
  let isValid = total % 10 === 0;

  	if (!isValid) {
    		return invalid;
  	}
	else {


 
  		if (array[0] === 5 && array.length === 16) return mastercard;
  		if (array[0] === 6 && array.length === 16) return discover;
 		if (array[0] === 3 && array[1] === 7 && array.length === 15) return AmericaExpress;
  		if (array[0] === 4 && (array.length === 13 || array.length === 16)) return visa;

  	return valid;

}
}



let two = [5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4];
let three = [6, 5, 6, 7, 8, 9, 2, 3, 7, 3, 5, 1, 9, 4, 2, 7];

let result = ATMCardCheack(two);
console.log(result);