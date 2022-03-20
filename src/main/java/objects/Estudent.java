package objects;

public class Estudent {
    public String nameStudent;
    private Integer age;
    protected Integer numberCourses;
    protected double average;
    public String residenceCity;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    protected Integer getNumberCourses() {
        return numberCourses;
    }

    protected void setNumberCourses(Integer numberCourses) {
        this.numberCourses = numberCourses;
    }

    public Estudent (){
        this.average = 6;
    }

    private void notesKeepMind(){
        if (average >= 7){
            System.out.println("El estudiante tiene un muy buen promedio");
        }else{
            System.out.println("Es bueno hacer seguimiento al estudiante");
        }
    }
}
