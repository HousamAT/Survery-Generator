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
        return questionText + " (Rate from " + min + " to " + max + ")";
    }

    @Override
    public void takeQuestion(java.util.Scanner scanner) {
        System.out.println(questionText + " (Rate from " + min + " to " + max + "): ");
        String answer = scanner.nextLine();
        System.out.println("You rated: " + answer);
    }
}
