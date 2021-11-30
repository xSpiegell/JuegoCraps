package juegoCraps;

import java.util.Random;

/**
 * Class Dado generates a random value between 1 and 6
 * @author Brayan Sanchez 2043554-3743
 * @version v.1.0.0 date 30/11/2021
 */

public class Dado {
    // atributo de esa clase que me devuelve la cara visible del dado
    private int cara;

    /**
     * Method that generates a random value of cara
     * @return number between (1,6)
     */
    public int getCara() {
        Random aleatorio = new Random(); // objeto de tipo Random para generar aleatorios
        cara = aleatorio.nextInt(6)+1; // metodo que devuelve un valor entre 0 y el valor asignado -1
        return cara;
    }
}
