// This abstract class serves as a blueprint for different types of questions in the survey.
// It includes an abstract method for formatting questions and a method for taking the question input.

public abstract class Question {
    protected String questionText;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public abstract String formatQuestion();
    public abstract void takeQuestion(java.util.Scanner scanner);
}
