package Project;
import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
        Student student1 = new Student("Karol", "Kowalski", "s25842", "kakowalski@pjwstk.edu.pl", "Złota 44");
        student1.grades = new double[]{3,4,5,2,3,4,4,5};
        
        System.out.println("Średnia ocena studenta to " + student1.studentAvgGrade());

        StudentGroup group1 = new StudentGroup("12c", new ArrayList<Student>());

        System.out.println(group1.showStudentsAmount());

        group1.addStudentToGroup(student1);

        System.out.println(group1.showStudentsAmount());

        System.out.println(group1.showStudentInGroup());
   }
}
