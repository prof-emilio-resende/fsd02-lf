package br.edu.impacta.dynamics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Dynamics {

    public static double getNumber() {
        return 32;
    }

    public static void tasteDynamics() {
        System.out.println("VARiables!!!");

        var age = Integer.valueOf(32);
        double returnValue = getNumber();

        var list = new ArrayList<String>() {{ add("new element"); }};
        var map = new ArrayList<Map<String, String>>() {{
            add(new LinkedHashMap<>() {{
                put("key", "value");
            }});
        }};

        System.out.println(age);
        System.out.println(returnValue);
        System.out.println(list);
        System.out.println(map);

        var o = new Object() {
            public String name = "Emilio";
            public String getName() {
                return name;
            }
        };

        System.out.println("more readability");
        System.out.println(o.name);
        o.name = "New Value!";
        System.out.println(o.getName());
    }
}
