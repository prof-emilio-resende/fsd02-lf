package br.edu.impacta;

import br.edu.impacta.collections.Collections;
import br.edu.impacta.dynamics.Dynamics;
import br.edu.impacta.functional.Functions;
import br.edu.impacta.objects.Objects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Types.variaveis();

        Controls.switchAndMore();

        Collections.listsAndMaps();

        Dynamics.tasteDynamics();

        Objects.playOO();

        Functions.playFunctional();
    }
}
