public class FertileDaysCalculatorFunction {
	public static int getNextPeriodDay(int lastPeriodDay, int cycleLength) {
		return lastPeriodDay + cycleLength;


}
	public static int getOvulationDay(int lastPeriodDay, int cycleLength) {
		return getNextPeriodDay(lastPeriodDay, cycleLength) - 14;


}

	public static int getfertileDayStart(int lastPeriodDay, int cycleLength) {
		return getOvulationDay(lastPeriodDay, cycleLength) - 2;


}

	public static int getfertileDayEnd(int lastPeriodDay, int cycleLength) {
		return getOvulationDay(lastPeriodDay, cycleLength) + 2;


}

	public static int getsafeDayBefore(int lastPeriodDay, int cycleLength) {
		return getfertileDayStart(lastPeriodDay, cycleLength) - 3;


}
	public static int getsafeDayAfter(int lastPeriodDay, int cycleLength) {
		return getfertileDayEnd(lastPeriodDay, cycleLength) + 3;


}



	public static void main(String[] args) {

		int lastPeriodDay = 5;
		int cycleLength = 28;



	System.out.println("Your next period may start on day: " + getNextPeriodDay(lastPeriodDay, cycleLength) + " of the month.");

	System.out.println("Your ovulation may happen on day: " + getOvulationDay(lastPeriodDay, cycleLength) + " of the month.");

	System.out.println("Your fertile day  start is from: " + getfertileDayStart(lastPeriodDay, cycleLength)  + " of the month. to " + getfertileDayEnd(lastPeriodDay, cycleLength) + " of the month");

	System.out.println("Your safe day migth be before day: " + getsafeDayBefore(lastPeriodDay, cycleLength)  + " of the month. to " + getsafeDayAfter(lastPeriodDay, cycleLength) + " of the month");





}

}