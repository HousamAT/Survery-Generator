import java.util.Scanner;
// This class serves as the entry point of the survey application.
// It allows the user to create a survey and offers the option to take the survey after creation.
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
