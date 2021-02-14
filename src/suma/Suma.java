package suma;

/**
 *
 * @author DellJIPL
 */
public class Suma {

    private int v1, v2, result;

    //Se crea constructor
    public Suma(int valor1, int valor2) {
        this.v1 = valor1;
        this.v2 = valor2;
    }

    public int suma(int v1, int v2) {
        result = v1 + v2;
        return result;
    }

    public void SalidaPantalla() {
        suma(v1, v2);
        System.out.println("El resultado de la suma es: " + result);
    }

}
