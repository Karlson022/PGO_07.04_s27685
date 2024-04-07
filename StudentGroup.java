import java.util.ArrayList;

public class StudentGroup {
    public String nazwa;
    public ArrayList<Student> student;

    public StudentGroup(String name, ArrayList<Student> st1){
        this.nazwa = name;
        this.student = st1;
    }

    public void addStudentToGroup(Student st){
        if(this.student.size()>=15){
            throw new IllegalArgumentException("Za duzo studentow w grupie");
        }else{
            for(int i = 0; i < student.size(); i++){
                if (st.equals(student.get(i))) {
                    throw new IllegalArgumentException("Jest juz taki student w tej grupie");
                }
            }   
        }
        this.student.add(st);
    }

    public String showStudentInGroup(){
        return this.student.toString();
    }

    public int showStudentsAmount(){
        return this.student.size();
    }



}
