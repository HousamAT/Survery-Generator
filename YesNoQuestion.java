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
