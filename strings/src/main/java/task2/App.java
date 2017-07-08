package task2;

import java.util.Scanner;

/**
 * Main class
 */
public class App {
    public static void main(String[] args) {
        final Questioner quiz = initQuiz();
        play(quiz);
    }

    private static Questioner initQuiz() {
        System.out.println("Choose language:");
        Questioner.printAvailableLanguages();
        return buildQuiz();
    }

    private static void play(Questioner questioner) {
        questioner.printQuestionOffer();
        final Scanner scanNumberOfQuestion = new Scanner(System.in);
        String questionOfferAnswer = "";

        while (!questionOfferAnswer.equals("stop")) {
            questionOfferAnswer = makeOfferForQuestion(scanNumberOfQuestion);

            questionOfferAnswer = chooseQuestion(questioner, scanNumberOfQuestion, questionOfferAnswer);

            if (checkAnswer(questioner, scanNumberOfQuestion, questionOfferAnswer)) return;

            questioner.printQuestionOffer();
        }
    }

    private static boolean checkAnswer(Questioner questioner, Scanner scanNumberOfQuestion, String questionOfferAnswer) {
        if (questionOfferAnswer == null) return true;
        String answer = scanNumberOfQuestion.nextLine();
        if (answer.equalsIgnoreCase(questioner.getAnswer(Integer.parseInt(questionOfferAnswer)))) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        return false;
    }

    private static String makeOfferForQuestion(Scanner scanNumberOfQuestion) {
        String questionOfferAnswer;
        questionOfferAnswer = scanNumberOfQuestion.nextLine();
        return questionOfferAnswer;
    }

    private static String chooseQuestion(Questioner questioner, Scanner scanNumberOfQuestion, String questionOfferAnswer) {
        boolean numberIsCorrect = false;
        while (!numberIsCorrect) {
            if (questionOfferAnswer.equals("stop")) {
                return null;
            }
            try {
                System.out.println(questioner.getQuestion(Integer.parseInt(questionOfferAnswer)));
                numberIsCorrect = true;
            } catch (NumberFormatException e) {
                questioner.printTypingRequirements();
                questionOfferAnswer = makeDialogWithUser(questioner, scanNumberOfQuestion);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                questionOfferAnswer = makeDialogWithUser(questioner, scanNumberOfQuestion);
            }
        }
        return questionOfferAnswer;
    }

    private static String makeDialogWithUser(Questioner questioner, Scanner scanNumberOfQuestion) {
        String numberOfQuestion;
        questioner.printQuestionOffer();
        numberOfQuestion = makeOfferForQuestion(scanNumberOfQuestion);
        return numberOfQuestion;
    }

    private static Questioner buildQuiz() {
        Questioner quiz = null;
        boolean quizIsConstructed = false;
        while (!quizIsConstructed) {
            try {
                Scanner scanner = new Scanner(System.in);
                quiz = new Questioner(scanner.nextLine());
                quizIsConstructed = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return quiz;
    }

}

