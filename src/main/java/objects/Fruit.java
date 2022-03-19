package objects;

import java.util.ArrayList;

public class Fruit {
    public String name;
    private float avarageWeight;
    public ArrayList<String> colors;

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}