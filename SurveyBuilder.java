import java.io.*;
import java.util.*;

// This class facilitates the creation of surveys by prompting the user for input.
// It handles adding questions to the survey and saving the survey to a file in a structured format.
public class SurveyBuilder {
    private Scanner scanner = new Scanner(System.in);

    public Survey createSurvey() {
        System.out.print("Enter survey title: ");
        String title = scanner.nextLine();
        System.out.print("Enter survey description: ");
        String description = scanner.nextLine();
        Survey survey = new Survey(title, description);

        while (true) {
            System.out.println("\n Choose the type of question you want to add by typing the corresponding number (1: Yes/No, 2: Rating Scale, 3: Text, 4: Multiple Choice, 0: Finish): ");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 0) break;

            System.out.print("Enter the question text: ");
            String questionText = scanner.nextLine();

            switch (choice) {
                case 1:
                    survey.addQuestion(new YesNoQuestion(questionText));
                    break;
                case 2:
                    System.out.print("Enter min value for rating: ");
                    int min = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter max value for rating: ");
                    int max = Integer.parseInt(scanner.nextLine());
                    survey.addQuestion(new RatingScaleQuestion(questionText, min, max));
                    break;
                case 3:
                    survey.addQuestion(new TextInputQuestion(questionText));
                    break;
                case 4:
                    System.out.println("Enter multiple choice options, separated by commas: ");
                    String[] optionsArray = scanner.nextLine().split(",");
                    List<String> options = Arrays.asList(optionsArray);
                    survey.addQuestion(new MultipleChoiceQuestion(questionText, options));
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        return survey;
    }

    public void saveSurvey(Survey survey, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(survey.toFormattedText());
            System.out.println("\nSurvey saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving the survey: " + e.getMessage());
        }
    }
}
