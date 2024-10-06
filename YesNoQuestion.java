// This class represents a yes/no question in the survey.
// It extends the Question class and formats the question with a "yes/no" prompt.

public class YesNoQuestion extends Question {

    public YesNoQuestion(String questionText) {
        super(questionText);
    }

    @Override
    public String formatQuestion() {
        return "\n" + questionText + " (yes/no)\n";
    }

    @Override
    public void takeQuestion(java.util.Scanner scanner) {
        System.out.println(formatQuestion());
        String answer = scanner.nextLine();
        System.out.println("You answered: " + answer + "\n");
    }
}
