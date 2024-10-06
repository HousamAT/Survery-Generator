public class RatingScaleQuestion extends Question {
    private int min;
    private int max;

    public RatingScaleQuestion(String questionText, int min, int max) {
        super(questionText);
        this.min = min;
        this.max = max;
    }

    @Override
    public String formatQuestion() {
        return "\n" + questionText + " (Rate from " + min + " to " + max + ")\n";
    }

    @Override
    public void takeQuestion(java.util.Scanner scanner) {
        System.out.println(formatQuestion());
        String answer = scanner.nextLine();
        System.out.println("You rated: " + answer + "\n");
    }
}
