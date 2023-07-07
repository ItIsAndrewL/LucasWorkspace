package AJ13_Priority_Queues_Maps.Project1_Class_Rank;

public class Student {
    private double gpa;
    private String name;
    public Student(String n, double g){
        this.name = n;
        this.gpa = g;
    }
    public double getGpa(){return this.gpa;}
    public String getName(){return this.name;}
    public String toString(){
        return "Student: " + this.name + " GPA:    " + this.gpa;
    }
}
