import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertion.assertEquals;

public class FertileDaysCalculatorTest {
	
	int lastPeriodDay = 5;
	int cycleLength = 28;


	@Test
	public void testNextPeriodDay() {
		int expected = 33;
		int actual = FertileDaysCalculatorFunction.getNextPeriodDay(lastPeriodDay, cycleLength);
		assertEquals(expected, actual);

}

	@Test
	public void testOvulationDay() {
		int expected = 19;
		int actual = FertileDaysCalculatorFunction.getOvulationDay(lastPeriodDay, cycleLength);
		assertEquals(expected, actual); 

}

	@Test
	public void testfertileDayStart() {
		int expected = 17;
		int actual = FertileDaysCalculatorFunction.getfertileDayStart(lastPeriodDay, cycleLength);
		assertEquals(expected, actual); 

}

	@Test
	public void testfertileDayEnd() {
		int expected = 21;
		int actual = FertileDaysCalculatorFunction.getfertileDayEnd(lastPeriodDay, cycleLength);
		assertEquals(expected, actual); 

}

	@Test
	public void testsafeDayBefore() {
		int expected = 14;
		int actual = FertileDaysCalculatorFunction.getsafeDayBefore(lastPeriodDay, cycleLength);
		assertEquals(expected, actual); 

}

	@Test
	public void testsafeDayAfter() {
		int expected = 24;
		int actual = FertileDaysCalculatorFunction.getsafeDayAfter(lastPeriodDay, cycleLength);
		assertEquals(expected, actual);

}


}


























