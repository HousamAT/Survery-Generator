import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        SurveyBuilder builder = new SurveyBuilder();
        Survey survey = builder.createSurvey();
        builder.saveSurvey(survey, "survey.txt");

        // Ask user if they want to take the survey
        System.out.println("\nDo you want to take the survey now? (yes/no): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            SurveyTaker taker = new SurveyTaker();
            taker.takeSurvey(survey);
        } else {
            System.out.println("Survey saved. You can take it later.");
        }
    }
}
