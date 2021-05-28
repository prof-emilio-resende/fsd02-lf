package br.edu.impacta;

public class Types {
    public static void variaveis() {
        System.out.println("iniciando com variaveis");
        String name = "isso é um texto";
        int idade = 40;
        double altura = 1.78;
        double peso = 90.0;
        
        Integer idadeOuNulo = null;

        if (idade % 2 != 0) idade = 0;

        if (idadeOuNulo == null) idadeOuNulo = idade;

        System.out.printf("%s %d %.2f %d %n", name, idade, peso, idadeOuNulo);

    }
}
