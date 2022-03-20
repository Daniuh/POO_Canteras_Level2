package objects;

import java.util.Date;

public class Teacher {
    public String nameTeacher;
    private Integer age;
    private String courseCharge;
    protected double salary;
    private Date admissionDate;
    public boolean condition;
    protected String residenceCity;

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getCourseCharge() {
        return courseCharge;
    }

    public void setCourseCharge(String courseCharge) {
        this.courseCharge = courseCharge;
    }

    protected double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher() {
        this.condition = true;
    }

    private void state(){
        if (condition){
            System.out.println("El profesor esta en estado: Activo");
        }else{
            System.out.println("El profesor esta en estado: Inactivo");
        }
    }
}
