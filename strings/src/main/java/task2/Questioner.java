package task2;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Created by kpkshke on 06.07.17.
 */

public class Questioner {
    public static final ResourceBundle availableLanguages = ResourceBundle.getBundle("languages");
    private final Locale locale;
    private ResourceBundle questions;
    private ResourceBundle answers;

    public Questioner(String language) {
        checkLanguageAvailability(language);

        locale = new Locale(language);
        questions = ResourceBundle.getBundle("questions", new Locale(language));
        answers = ResourceBundle.getBundle("answers", new Locale(language));

    }

    public static void printAvailableLanguages() {
        availableLanguages.keySet().forEach(System.out::println);
    }

    public ResourceBundle getQuestions() {
        return questions;
    }

    public ResourceBundle getAnswers() {
        return answers;
    }

    public String getQuestion(int numberOfQuestion) {
        try {
            final String questionKey = "question".concat(String.valueOf(numberOfQuestion));
            return questions.getString(questionKey);
        } catch (MissingResourceException e) {
            final int numberOfQuestions = questions.keySet().size();
            throw new IllegalArgumentException(String.format(
                    "Wrong number of question. Number must be from 1 to %s", numberOfQuestions));
        }
    }

    public String getAnswer(int numberOfAnswer) {
        try {
            final String answerKey = "answer".concat(String.valueOf(numberOfAnswer));
            return answers.getString(answerKey);
        } catch (MissingResourceException e) {
            final int numberOfAnswers = questions.keySet().size();
            throw new IllegalArgumentException(String.format(
                    "Wrong number of answer. Number must be from 1 to %s", numberOfAnswers));
        }
    }

    public void printQuestionOffer() {
        printOffer(locale);
    }

    public void printTypingRequirements() {
        printRequirements(locale);
    }

    private void printOffer(Locale locale) {
        if (locale.equals(new Locale("en"))) {
            System.out.println("Choose number of question, if you want to end game - type stop");
        } else {
            System.out.println("Введите номер вопроса, если вы хотите закончить игру - введите stop");
        }
    }

    private void printRequirements(Locale locale) {
        if (locale.equals(new Locale("en"))) {
            System.out.println("Number of question must be a integer number");
        }else {
            System.out.println("Номер вопроса может состоять только из целого числа");
        }
    }

    private void checkLanguageAvailability(String language) {
        if (availableLanguages.keySet().contains(language)) {
            return;
        }

        throw new IllegalArgumentException("Illegal language, language can be: "
                .concat(getAvailableLanguageAsString()));
    }
    private String getAvailableLanguageAsString() {
        final StringBuilder result = new StringBuilder();

        availableLanguages.keySet().forEach((languageKey) -> result.append(languageKey).append(" "));

        return result.toString();
    }



}
