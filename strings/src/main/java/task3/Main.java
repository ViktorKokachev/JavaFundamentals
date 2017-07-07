package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Mainclass for third task
 */
public class Main {
    public static void main(String[] args) throws URISyntaxException, UnsupportedEncodingException {
        InputStreamReader reader = new InputStreamReader(Main.class.getClassLoader().
                getResourceAsStream("task.html"), "windows-1251");

        int lastImgIdx = 0;
        int currImgIdx = 0;
        boolean isOrder = true;

        try (BufferedReader br = new BufferedReader(reader)) {
            Pattern orderPattern = Pattern.compile("\\([Рр]ис(\\. )(\\d+)([^)]*)\\)", Pattern.MULTILINE);
            Pattern sentencePattern = Pattern.compile("([А-Я][^.]*)\\([Рр]ис( )(\\d+)([^)]*)\\)[^.]*\\.", Pattern.MULTILINE);

            Set<String> sentences = new HashSet<>();

            while (br.ready()) {
                String line1 = br.readLine();
                if (line1 == null) {
                    break;
                }
                String line2 = br.readLine();
                String result;
                if (line2 != null) {
                    result = line1 + line2;
                } else {
                    result = line1;
                }

                Matcher matcher = orderPattern.matcher(result);
                while (matcher.find()) {
                    if (isOrder) {
                        lastImgIdx = currImgIdx;
                        currImgIdx = Integer.parseInt(matcher.group(2));

                        if (currImgIdx - lastImgIdx != 1 && lastImgIdx != 0) {
                            System.out.printf("Ссылки на рисунки не последовательны. Last: %d, Current: %d\n",
                                    lastImgIdx, currImgIdx);
                        } else {
                            System.out.printf("Ссылки на рисунки последовательны. Last: %d, Current: %d\n",
                                    lastImgIdx, currImgIdx);
                        }

                        String replaced = result.replace("ис.", "ис");


                        Matcher matcherSentence = sentencePattern.matcher(replaced);
                        while (matcherSentence.find()) {
                            sentences.add(matcherSentence.group(0));
                        }
                    }
                }
            }

            System.out.println("Предложения со ссылками на ресурсы:");

            for (String sentence : sentences) {
                sentence = sentence.replace("Рис ", "Рис. ");
                sentence = sentence.replace("рис ", "рис. ");
                System.out.println(sentence);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


