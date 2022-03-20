package objects;

import java.util.Date;

/**
 * Esta clase almacena los datos relacionados ah un profesor
 * @author Daniel Mauricio Naranjo Benavides
 */
public class Teacher {
    /**
     * Esta propiedad almacena el nombre del profesor
     */
    public String nameTeacher;
    /**
     * Esta propiedad almacena la edad del profesor
     */
    private Integer age;
    /**
     * Esta propiedad almacena el curso que tiene ah cargo el profesor
     */
    private String courseCharge;
    /**
     * Esta propiedad almacena el salario que tiene el profesor
     */
    protected double salary;
    /**
     * Esta propiedad almacena el día en el que entro el profesor a la institución
     */
    private Date admissionDate;
    /**
     * Esta propiedad almacena el estado del profesor
     */
    public boolean condition;
    /**
     * Esta propiedad almacena la ciudad en donde vive el profesor
     */
    protected String residenceCity;

    /**
     * Método para obtener el nombre del profesor
     * @return Nombre del profesor
     */
    public String getNameTeacher() {
        return nameTeacher;
    }

    /**
     * Método para modificar el nombre del profesor
     * @param nameTeacher Nombre del profesor
     */
    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    /**
     * Método para obtener el curso al que esta a cargo el profesor
     * @return Curso a cargo
     */
    public String getCourseCharge() {
        return courseCharge;
    }

    /**
     * Método para modificar el curso al que esta cargo l profesor
     * @param courseCharge Curso a cargo
     */
    public void setCourseCharge(String courseCharge) {
        this.courseCharge = courseCharge;
    }

    /**
     * Método para obtener el salario del profesor
     * @return Salario profesor
     */
    protected double getSalary() {
        return salary;
    }

    /**
     * Método para modificar el salario del profesor
     * @param salary Salario profesor
     */
    protected void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Constructor para inicializar el estado en el que se encuentra el profesor
     */
    public Teacher() {
        this.condition = true;
    }

    /**
     * Método para saber el estado del profesor, saber si está activo o se encuentra inactivo
     */
    private void state(){
        if (condition){
            System.out.println("El profesor esta en estado: Activo");
        }else{
            System.out.println("El profesor esta en estado: Inactivo");
        }
    }
}
