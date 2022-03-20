package objects;

import java.util.Date;

/**
 * Esta clase almacena los datos relacionados ah los de una persona
 * @author Daniel Mauricio Naranjo Benavides
 */
public class Person {
    /**
     * Propiedad para almacenar el nombre de la persona
     */
    public String name;
    /**
     * Propiedad para almacenar el segundo nombre de la persona
     */
    public String name2;
    /**
     * Propiedad para almacenar el apellido de la persona
     */
    public String lastName;
    /**
     * Propiedad para almacenar el segundo apellido de la persona
     */
    public String lastName2;
    /**
     * Propiedad para guardar la fecha de nacimiento de la persona
     */
    public Date dateBirth;
    /**
     * Propiedad para guardar la altura de la persona
     */
    public float height;
    /**
     * Propiedad para almacenar la edad de la persona
     */
    public Integer age;

    /**
     * Método para obtener el nombre de la persona
     * @return Nombre de la persona
     */
    public String getName() {
        return name;
    }

    /**
     * Método para modificar el nombre de la persona
     * @param name Nombre de la persona
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método para obtener la edad de la persona
     * @return Edad de la persona
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Método para modificar la edad de la persona
     * @param age Edad de la persona
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Método para obtener el apellido de la persona
     * @return Apellido de la persona
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Método para modificar el apellido de la persona
     * @param lastName Apellido de la persona
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Método para obtener la altura de la persona
     * @return Altura de la persona
     */
    public float getHeight() {
        return height;
    }

    /**
     * Método para modificar la altura de la persona
     * @param height Altura de la persona
     */
    public void setHeight(float height) {
        this.height = height;
    }
}
