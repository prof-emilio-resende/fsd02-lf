package br.edu.impacta.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Collections {
    public static void listsAndMaps() {
        System.out.println("initializing collections in java!");
        String[] names = new String[] { "Emilio", "Murta" };
        System.out.println(Arrays.toString(names));

        Map<String, String> record = new LinkedHashMap<>() {{
            put("key", "value");
            put("key1", "value1");
        }};
        System.out.println(record);

        // por favor, não faça isso!
        Map<String, String> anonymousRecord = new LinkedHashMap<>();
        {
            anonymousRecord.put("k", "v");
        }
        System.out.println(anonymousRecord);

        List<Map<String, String>> complexRecord = new ArrayList<>() {{
            add(new LinkedHashMap<>() {{
                put("chave", "valor");
            }});
        }};
        System.out.println(complexRecord);

        List<Map<String, String>> fancyRecord = List.of(
            Map.of("chave","valor", "chave2", "valor2"),
            Map.of("key", "value")
        );
        System.out.println(fancyRecord);

        for (Map<String,String> map : fancyRecord) {
            for(String k : map.keySet()) {
                System.out.println("chave " + k);
            }

            for(String v : map.values()) {
                System.out.println("value: " + v);
            }

            for(Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
    }
}
