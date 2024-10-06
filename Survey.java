import java.util.*;

public class Survey {
    private String title;
    private String description;
    private List<Question> questions;

    public Survey(String title, String description) {
        this.title = title;
        this.description = description;
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public String toFormattedText() {
        StringBuilder sb = new StringBuilder();
        sb.append("Survey Title: ").append(title).append("\n");
        sb.append("Description: ").append(description).append("\n\n");
        for (int i = 0; i < questions.size(); i++) {
            sb.append("Q").append(i + 1).append(". ");
            sb.append(questions.get(i).formatQuestion()).append("\n");
        }
        return sb.toString();
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public String getTitle() {
        return title;
    }
}
