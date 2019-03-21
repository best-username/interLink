package institution.interlink;

import java.util.ArrayList;
import person.Student;
import institution.University;

public class Internship {
    private String name;
    private ArrayList<Student> students;
    
    // constructor to set up the initial values to an object
    public Internship(String name) {
        this.name = name;
        students = new ArrayList<Student>();
    }

    public void setStudent(Student student) {
        students.add(student);
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
