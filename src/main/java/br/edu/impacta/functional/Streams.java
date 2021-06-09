package br.edu.impacta.functional;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void playStreams() {
        System.out.println("PLaying with streams!");

        List.of("oNe", "TWO", "tHreE")
            .stream()
            .map(x -> {
                System.out.println("processing stream map...");
                return x.toUpperCase();
            })
            .forEach(System.out::println);

        List.of("oNe", "TWO", "tHreE")
            .parallelStream()
            .map(x -> {
                System.out.println("processing parallel stream map...");
                return x.toUpperCase();
            })
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }
    
}
