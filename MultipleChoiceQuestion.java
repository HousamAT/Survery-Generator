import java.util.*;

// This class represents a multiple-choice question in the survey.
// It allows users to select one answer from a list of predefined options.
public class MultipleChoiceQuestion extends Question {
    private List<String> options;

    public MultipleChoiceQuestion(String questionText, List<String> options) {
        super(questionText);
        this.options = options;
    }

    @Override
    public String formatQuestion() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append(questionText).append(" (Select one):\n");
        for (int i = 0; i < options.size(); i++) {
            sb.append((i + 1)).append(". ").append(options.get(i)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public void takeQuestion(java.util.Scanner scanner) {
        System.out.println(formatQuestion());
        String answer = scanner.nextLine();
        System.out.println("You selected: " + answer + "\n");
    }
}
