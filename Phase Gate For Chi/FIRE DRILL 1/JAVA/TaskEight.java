public class TaskEight {
	public static void main(String[] args) {

	int total = 0;
	for(int count = 1; count <= 10; count++) {
		if (count % 4 == 0) {
		int sum = 0;
	for(int counter = 1; counter <= 5; counter++) {
	 sum += (int)Math.pow(count, counter);
}
	total += sum;
}
}
	System.out.print(total);

}
}