package objects;

import java.util.ArrayList;

/**
 * Esta clase almacena los datos relacionados ah una fruta
 * @author Daniel Mauricio Naranjo Benavides
 */
public class Fruit {
    /**
     * Propiedad para almacenar el nombre de la fruta
     */
    public String name;
    /**
     * Propiedad para almacenar el tamaño de la fruta
     */
    private float avarageWeight;
    /**
     * Propiedad para almacenar el color de la fruta
     */
    public ArrayList<String> colors;

    /**
     * Método para obtener el color de la fruta
     * @return Color de la fruta
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Método para modificar el color de la fruta
     * @param colors Color de la fruta
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}