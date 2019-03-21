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
    
    public void addStudent(Student student, University university) {
        if(student.getKnowledge().getLevel() > university.getAverage())
            setStudent(student);
        else
            System.out.println(student.getName() + " , sorry, but you can not be added to the intership, please, become more clever and come again ;)\n");
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
