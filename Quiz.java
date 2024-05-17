import java.util.Scanner;

public class QuizProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Define the questions and answers
        String[] questions = {
            "What is the capital of France?",
            "Which planet is known as the Red Planet?",
            "What is the chemical symbol for water?"
        };

        String[] answers = {
            "paris",
            "mars",
            "h2o"
        };

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison

            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }

        // Display final score
        System.out.println("Your final score is: " + score + "/" + questions.length);

        scanner.close();
    }
}
