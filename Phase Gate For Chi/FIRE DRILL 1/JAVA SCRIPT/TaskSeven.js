const number = 10; 
	
	for (let count = 1; count <= number; count++) {
		if (count % 4 == 0) {
			let total = 0;
	for(let counter = 1; counter <= 5; counter++){	
		total += (Math.floor(Math.pow(count, counter)));
}
	console.log (total + " ")	
}

}
