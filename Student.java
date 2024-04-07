public class Student {
    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public double[] grades;

    public Student(String name, String surname, int index, String mail, String street){
        this.fname = name;
        this.lname = surname;
        this.indexNumber = index;
        this.email = mail;
        this.address = street;
    }

    public double studentAvgGrade(){
        double gradesSum = 0;

        if(this.grades.length == 0){
            throw new IllegalArgumentException("Student nie ma ocen!!!");
        }else if(this.grades.length > 20){
            throw new IllegalArgumentException("Student ma za duzo ocen!!!");
        }else{
            for(int i = 0; i < this.grades.length; i++){
                gradesSum+=grades[i];
            }  
        }
        double avgGrade = gradesSum/grades.length;
        return Math.round(avgGrade);
    }
}
