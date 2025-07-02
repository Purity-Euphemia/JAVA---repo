import java.util.Scanner;
public class StudentScore {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("How many students do you have?: ");
	int studentNumber = input.nextInt();

	System.out.print("How many subject do they offer?: ");
	int subjectNumber = input.nextInt();

	
	for (int count = 1; count <= studentNumber; count++) {
		System.out.println("\nWhat is the name of student " + count + "?");
		System.out.print("Enter student name: ");
		String name = input.next();

		double studentTotal = 0;


		for (int counter = 1; counter <= subjectNumber; counter++) {
			System.out.print("\nWhat is the name of subject " + counter + ":");
			String subjectName = input.next();

			System.out.print("Enter score for " + subjectName + "(1-100)");
			double score = input.nextDouble();
			studentTotal = studentTotal + score;

}
		double average = studentTotal / subjectNumber;

	System.out.println("Name: " + name);
	System.out.println("Total Score: " + studentTotal);
	System.out.println("Average: " + average);
	System.out.println("============================");


}

}
}