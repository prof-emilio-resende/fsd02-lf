package br.edu.impacta.async;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Async {

    private static final ExecutorService executor = Executors.newFixedThreadPool(4);
    private static List<String> names = List.of("words", "of", "the", "list");

    public static void runAsync() {
        var localDate = LocalDateTime.now();
        System.out.println("starting async...");
        System.out.println(localDate);

        var asyncResult = getDataAsync();

        System.out.println("while I wait ... I can...");
        System.out.println(LocalDateTime.now());

        List<String> result = null;
        try {
            result = asyncResult.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.print(result);

        var newDate = LocalDateTime.now();
        System.out.println("finalizing async...");
        System.out.println(newDate);
    }

    public static Future<List<String>> getDataAsync() {

        return executor.submit(() -> {
            System.out.println("before");
            System.out.println(LocalDateTime.now());
            for (String name : names) {
                executor.submit(() -> {
                    System.out.printf("fake wait for %s...%n", name);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return name;
                });
            }
            System.out.println(LocalDateTime.now());
            System.out.println("after");

            return names;
        });
    }

    public static void runSync() {
        var localDate = LocalDateTime.now();
        System.out.println("starting sync...");
        System.out.println(localDate);

        List<String> result = getDataSync();
        System.out.println(result);
        var newDate = LocalDateTime.now();
        System.out.println("finalizing sync...");
        System.out.println(newDate);
    }

    public static List<String> getDataSync() {
        for (String name : names) {
            System.out.printf("fake wait for %s...%n", name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return names;
    }

    public static void playAsync() {
        System.out.println("Playing async");

        runSync();
        runAsync();
        executor.shutdown();
    }
}
