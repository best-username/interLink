package institution.interlink;

import person.Student;

public class Internship {
    
    private String name;
    private Student[] students = new Student[100];
    private int countOfStudents;
    private String allStudents;
    
    // constructor to set up the initial values to an object
    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        students[countOfStudents] = student;
        countOfStudents++;
    }

    public String getStudents() {
        for (int i = 0; i < countOfStudents ; i++) {
            allStudents += students[i].getName();
        }
        return allStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
