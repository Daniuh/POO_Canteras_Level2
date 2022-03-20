package objects;

public class Course {
    public String nameCourse;
    protected String nameTeacher;
    private String duration;
    public int levelComplexity;
    protected double price;

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    protected double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected String getDuration() {
        return duration;
    }

    protected void setDuration(String duration) {
        this.duration = duration;
    }

    private void complexityMessage(){
        if(levelComplexity > 7 && levelComplexity <= 10){
            System.out.println("El nivel de complejidad de este curso es: Avanzado");
        }else{
            System.out.println("El nivel de complejidad de este curso es: Basico");
        }
    }
}
