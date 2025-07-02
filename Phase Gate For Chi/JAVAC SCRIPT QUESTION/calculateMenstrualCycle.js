function calculateMenstrualCycle(lastPeriodDay, cycleLength) {
	
	let nextPeriod = lastPeriodDay + cycleLength;
	let ovulation = nextPeriod - 14;
	let fertileDayStart = ovulation -2;
	let fertileDayEnd = ovulation + 2;
	let safeDayBefore = fertileDayStart - 3;
	let safeDayAfter = fertileDayEnd + 3;




	let result =
		"Menstral Cycle Calculation:\n" +
		"Next Period Day:" + nextPeriod + "\n" +
		"Ovulation Day: " + ovulation + "\n" +
		"Fertile Window: from Day: " + fertileDayStart + " to " + fertileDayEnd + "\n" +
		"Safe Days: from Day: " + safeDayBefore + " to " + safeDayAfter ;

	console.log(result);
}



"WELCOME TO THE MENSURATION CYCLE TRACKER APP!"
calculateMenstrualCycle(5, 28);