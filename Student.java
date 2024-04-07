public class Student {
    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public double[] grades;

    public Student(String name, String surname, int index, String mail, String street, double[] grade){
        this.fname = name;
        this.lname = surname;
        this.indexNumber = index;
        this.email = mail;
        this.address = street;
        this.grades = grade;
    }
}
