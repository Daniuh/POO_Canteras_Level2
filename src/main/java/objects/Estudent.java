package objects;

/***
 * Esta clase almacenará los datos relacionados a un estudiante
 * @author Daniel Mauricio Naranjo Benavides
 */
public class Estudent {
    /**
     * Esta propiedad almacenará el nombre del estudiante
     */
    public String nameStudent;
    /***
     * Esta propiedad almacenará la edad del estudiante
     */
    private Integer age;
    /***
     * Esta propiedad almacenará el número de cursos a los cuales está vinculado el estudiante
     */
    protected Integer numberCourses;
    /***
     * Esta propiedad almacena el promedio del estudiante ah nivel de notas
     */
    protected double average;
    /***
     * Esta propiedad almacena la ciudad donde reside el estudiante
     */
    public String residenceCity;

    /**
     * Método para obtener la edad del estudiante
     * @return Edad del estudiante
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Método para modificar la edad del estudiante
     * @param age Edad estudiante
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Método para obtener el número de cursos a los cuales está vinculado el estudiante
     * @return Número de cursos
     */
    protected Integer getNumberCourses() {
        return numberCourses;
    }

    /**
     * Método para modificar el número de cursos a los cuales está vinculado el estudiante
     * @param numberCourses Número de cursos
     */
    protected void setNumberCourses(Integer numberCourses) {
        this.numberCourses = numberCourses;
    }

    /**
     * Constructor para inicializar la propiedad average
     */
    public Estudent (){
        this.average = 6;
    }

    /**
     * Método para saber que tan bueno es el promedio del estudiante
     */
    private void notesKeepMind(){
        if (average >= 7){
            System.out.println("El estudiante tiene un muy buen promedio");
        }else{
            System.out.println("Es bueno hacer seguimiento al estudiante");
        }
    }
}
