package br.edu.impacta.objects;

import java.util.ArrayList;

import br.edu.impacta.objects.abstracts.Thinker;

class Person implements Thinker {
    private String name;
    private String cpf;

    @Override
    public String think() {
        return "Oh, I don't know...";
    }

    /// From now on just default lang stuff (getter, setters, etc)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("Person{%nname=[%s],%n cpf=[%s]%n}", this.name, this.cpf);
    }
}

class SmartPerson extends Person {
    @Override
    public String think() {
        var val = "thinking smartly...";

        return val;
    }
}

public class Objects {
    public static void playOO() {
        var person = new Person();
        person.setName("Emilio");
        person.setCpf("231312");
        
        var smartPerson = new SmartPerson();
        smartPerson.setName("smart");
        smartPerson.setCpf("333");

        var people = new ArrayList<Thinker>();
        people.add(person);
        people.add(smartPerson);

        for(var p : people) {
            System.out.println(p.think());
        }
    }
}
