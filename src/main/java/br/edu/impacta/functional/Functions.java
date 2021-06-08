package br.edu.impacta.functional;

import java.util.function.Function;

public class Functions {
    private static Function<String, String> loggerBuilder(
            String prefix, 
            String suffix,
            Function<String, String> logger) {
        return text -> {
            var formattedText = String.format("%s%s%s", prefix, text, suffix);
            logger.apply(formattedText);

            return formattedText;
        };
    }

    public static String printLn(String text) {
        System.out.println(text);
        return text;
    }

    public static void playFunctional() {
        System.out.println("yeah, playing functional!");

        var logger = loggerBuilder("[", "]", Functions::printLn);
        logger.apply("loggin at console...");
    }
}
