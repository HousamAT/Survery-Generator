public class Main {
    public static void main(String[] args) {
        SurveyBuilder builder = new SurveyBuilder();
        Survey survey = builder.createSurvey();
        builder.saveSurvey(survey, "survey.txt");

        SurveyTaker taker = new SurveyTaker();
        taker.takeSurvey(survey);  // Simulating taking the survey immediately after creation
    }
}
