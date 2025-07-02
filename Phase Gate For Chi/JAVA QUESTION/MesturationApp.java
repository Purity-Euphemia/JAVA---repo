import java.util.Scanner;
public class MesturationApp {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("WELCOME TO THE MENSURATION CYCLE TRACKER APP!");
	

	System.out.print("Enter the your last period started (1-31): ");
	int lastPeriodDay = input.nextInt();

	System.out.print("Enter your cycle length in day (e.g 28): ");
	int cycleLength = input.nextInt();
 
	// how the 28 days came about is from the first day you see your period to the day before you see your next period. and normal cylce length is 	between (21 - 35) 

	System.out.print("Enter how many days your period lasts (e.g 5): ");
	int periodLength = input.nextInt();

	MesturationAppFunction(lastPeriodDay, periodLength, cycleLength);


}

	


	public static void MesturationAppFunction(int lastPeriodDay, int periodLength, int cycleLength) {

	int nextPeriodDay = lastPeriodDay + cycleLength;

	// you start counting from the first day of your period give it a day 1, to how many days to your cycle length(28 days)

	
	int ovulationDay = nextPeriodDay - 14; 

	// ovulation usally occurs in 14 days before the next period and to get this ovulation count back ward from that your period to the number of 	days you get 14

	int fertileDayStart = ovulationDay - 2;

	// two days before your ovulation

	int fertileDayEnd = ovulationDay + 2;

	// two days after your ovulation

	int safeDayBefore = fertileDayStart - 3;

	// another 3 day before your fertile day

	int safeDayAfter = fertileDayEnd + 3;

	// another 3 days after your fertile day



	System.out.println("Your next period may start on day: " + nextPeriodDay + " of the month.");

	System.out.println("Your ovulation may happen on day: " + ovulationDay + " of the month.");

	System.out.println("Your fertile day  start is from: " + fertileDayStart  + " of the month. to " + fertileDayEnd + " of the month");

	System.out.println("Your safe day migth be before day: " + safeDayBefore  + " of the month. to " + safeDayAfter + " of the month");






}
}