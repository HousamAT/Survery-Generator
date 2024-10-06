// This class represents a free-text input question in the survey.
// It allows users to provide their response as a free-form text answer.
public class TextInputQuestion extends Question {

    public TextInputQuestion(String questionText) {
        super(questionText);
    }

    @Override
    public String formatQuestion() {
        return questionText + " (Text Response)";
    }

    @Override
    public void takeQuestion(java.util.Scanner scanner) {
        System.out.println(questionText + ": ");
        String answer = scanner.nextLine();
        System.out.println("You wrote: " + answer);
    }
}
