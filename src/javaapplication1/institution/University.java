package institution;

import person.Student;
import java.util.ArrayList;

public class University {
    
    private String name;
    private ArrayList<Student> students;
    private int average;
    private int totalScore;
    
    // constructor to set up the initial values to an object
    public University(String name) {
        this.name = name;
        students = new ArrayList<Student>();
    }

    //setters, getters and so on
    public void setStudent(Student student) {
        addStudent(student);
    }

    public void addStudent(Student student) {
        students.add(student);
        computeAverage();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getTotalScore() {
        return totalScore;
    }
    
    public int getAverage() {
        return average;
    }
    
    // compute average level of the knowledge in the university
    public void computeAverage() {
        totalScore = 0;
        for (int i=0; i<students.size(); i++)
            totalScore += students.get(i).getKnowledge().getLevel();
        this.average = totalScore / students.size();
    }

}
