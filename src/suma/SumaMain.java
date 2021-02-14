package suma;

import java.util.Scanner;

/**
 *
 * @author DellJIPL
 */
public class SumaMain {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el primer valor: ");
        int valor1 = entrada.nextInt();

        System.out.println("Ingresa el segundo valor: ");
        int valor2 = entrada.nextInt();

        //Se crea objeto y se pasan parametros que llegaran a la clase Suma.java
        Suma obj = new Suma(valor1, valor2);

        //El objeto ejecuta el metodo
        obj.SalidaPantalla();
    }
}
