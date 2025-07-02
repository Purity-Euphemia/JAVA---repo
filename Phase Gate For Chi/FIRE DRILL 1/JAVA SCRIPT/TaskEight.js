const number = 10; 
	
	let total = 0;
	for (let count = 1; count <= number; count++) {
		if (count % 4 == 0) {
			let sum = 0;
	for(let counter = 1; counter <= 5; counter++){	
		sum += (Math.floor(Math.pow(count, counter)));
}
	total += sum;		
}
}	

	console.log (total);

