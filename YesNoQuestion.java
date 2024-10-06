public class YesNoQuestion extends Question {

    public YesNoQuestion(String questionText) {
        super(questionText);
    }

    @Override
    public String formatQuestion() {
        return questionText + " (yes/no)";
    }

    @Override
    public void takeQuestion(java.util.Scanner scanner) {
        System.out.println(questionText + " (yes/no): ");
        String answer = scanner.nextLine();
        System.out.println("You answered: " + answer);
    }
}
