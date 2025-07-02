import java.util.Scanner;

public class MBTIPersonalityTestSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "1. Do you enjoy being around people? (A) Yes (B) No",
            "2. Do you prefer facts over ideas? (A) Yes (B) No",
            "3. Are you guided by logic more than emotions? (A) Yes (B) No",
            "4. Do you like to have a plan rather than being spontaneous? (A) Yes (B) No",
            "5. Do you find it easy to make new friends? (A) Yes (B) No",
            "6. Do you enjoy solving problems more than talking about them? (A) Yes (B) No",
            "7. Are you more practical than imaginative? (A) Yes (B) No",
            "8. Do you usually stick to deadlines? (A) Yes (B) No",
            "9. Do you enjoy group activities? (A) Yes (B) No",
            "10. Do you prefer real things to ideas? (A) Yes (B) No",
            "11. Are you more critical than forgiving? (A) Yes (B) No",
            "12. Do you prefer routines over surprises? (A) Yes (B) No",
            "13. Do you talk more than you listen? (A) Yes (B) No",
            "14. Do you trust facts more than feelings? (A) Yes (B) No",
            "15. Are you more serious than playful? (A) Yes (B) No",
            "16. Do you like to finish tasks before relaxing? (A) Yes (B) No",
            "17. Do you make decisions quickly? (A) Yes (B) No",
            "18. Do you enjoy being the center of attention? (A) Yes (B) No",
            "19. Do you follow rules closely? (A) Yes (B) No",
            "20. Do you prefer to work alone? (A) Yes (B) No"
        };

        int aCount = 0;
        int bCount = 0;
        String answer;

        System.out.println("Welcome to the MBTI Personality Test!");
        System.out.println("Please answer the following questions with 'A' or 'B'.\n");

        for (int count = 0; count < questions.length; count++) {
            while (true) {
                System.out.print(questions[count] + "\nYour answer (A/B): ");
                answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("A")) {
                    aCount++;

                    if (count == questions.length - 1) {  
                        if (aCount > bCount) {
                            System.out.println("Your result: ESTJ");
                            System.out.println("You seem Extroverted, Sensing, Thinking, Judging.");
                        } else {
                            System.out.println("Your result: INFP");
                            System.out.println("You seem Introverted, Intuitive, Feeling, Perceiving.");
                        }
                    }
                    break;
                } else if (answer.equalsIgnoreCase("B")) {
                    bCount++;

                    if (count == questions.length - 1) { 
                        if (aCount > bCount) {
                            System.out.println("Your result: ESTJ");
                            System.out.println("You seem Extroverted, Sensing, Thinking, Judging.");
                        } else {
                            System.out.println("Your result: INFP");
                            System.out.println("You seem Introverted, Intuitive, Feeling, Perceiving.");
                        }
                    }
                    break;
                } else {
                    System.out.println("Please enter only A or B.");
                }
            }
        }

        System.out.println("\n--- Test Complete ---");
        System.out.println("You chose A " + aCount + " times.");
        System.out.println("You chose B " + bCount + " times.");

    }
}
