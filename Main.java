public class Main {
   public static void main(String[] args) {
        Student student1 = new Student("Karol", "Kowalski", 1, "kakowalski@pjwstk.edu.pl", "Złota 44");
        student1.grades = new double[]{3,4,5,2,3,4,4,5};
        
        System.out.println("Średnia ocena studenta to " + student1.studentAvgGrade());
   }
}
