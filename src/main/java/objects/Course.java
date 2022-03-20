package objects;

/**
 * Esta clase almacenará los datos relacionados a un curso
 * @author Daniel Mauricio Naranjo Benavides
 */
public class Course {
    /***
     * Esta propiedad almacena el nombre del curo
     */
    public String nameCourse;
    /***
     * Esta propiedad almacena el nombre del profesor que esta a cargo de este curso
     */
    protected String nameTeacher;
    /***
     * Esta propiedad almacena la duración que tendrá el curso
     */
    private String duration;
    /***
     * Esta propiedad almacena el nivel de complejidad que tiene el curso
     */
    public double levelComplexity;
    /***
     * Esta propiedad almacena el precio en el que se encuentra el curso
     */
    protected double price;

    /***
     * Método para obtener el nombre del curso
     * @return Nombre del curso obtenido
     */
    public String getNameCourse() {
        return nameCourse;
    }

    /***
     * Método para modificar el nombre del curso
     * @param nameCourse Nombre del curso
     */
    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    /***
     * Método para obtener el precio del curso
     * @return Precio del curso
     */
    protected double getPrice() {
        return price;
    }

    /***
     * Método para modificar el precio del curso
     * @param price Precio del curso
     */
    protected void setPrice(double price) {
        this.price = price;
    }

    /***
     * Método para obtener la duración que tiene el curso
     * @return Duración del curso
     */
    protected String getDuration() {
        return duration;
    }

    /***
     * Método para modificar la duración del curso
     * @param duration Duración del curso
     */
    protected void setDuration(String duration) {
        this.duration = duration;
    }

    /***
     * Constructor para inicializar la propiedad levelComplexity
     */
    public Course(){
        this.levelComplexity = 8;
    }

    /***
     *Método para definir si el curso es avanzado o basico
     */
    private void complexityMessage(){
        if(levelComplexity > 6.5 && levelComplexity <= 10){
            System.out.println("El nivel de complejidad de este curso es: Avanzado");
        }else{
            System.out.println("El nivel de complejidad de este curso es: Basico");
        }
    }
}
