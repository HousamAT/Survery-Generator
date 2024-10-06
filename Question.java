public abstract class Question {
    protected String questionText;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public abstract String formatQuestion();
    public abstract void takeQuestion(java.util.Scanner scanner);
}
