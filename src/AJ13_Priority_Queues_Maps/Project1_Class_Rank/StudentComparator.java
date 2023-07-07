package AJ13_Priority_Queues_Maps.Project1_Class_Rank;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if(student1.getGpa() < student2.getGpa()){
            return 1;
        }
        else if(student1.getGpa() > student2.getGpa()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
