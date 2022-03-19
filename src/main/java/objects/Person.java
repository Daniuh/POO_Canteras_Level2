package objects;

import java.util.Date;

public class Person {
    public String name;
    public String lastName;
    public String lastName2;
    public Date dateBirth;
    public float height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
