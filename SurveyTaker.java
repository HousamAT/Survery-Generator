import java.util.*;

public class SurveyTaker {

    public void takeSurvey(Survey survey) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taking survey: " + survey.getTitle());
        for (Question question : survey.getQuestions()) {
            question.takeQuestion(scanner);
        }
    }

    public Survey loadSurvey(String filename) {
        // Placeholder for loading survey logic (from file or storage)
        System.out.println("Loading survey from file not yet implemented.");
        return null; // Implement file loading logic if needed
    }
}
