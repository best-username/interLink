package institution;

import person.Student;

public class University {
    
    private String name;
    private Student[] students = new Student[100];
    private int countOfStudents;
    private int totalScore;
    
    // constructor to set up the initial values to an object
    public University(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        students[countOfStudents] = student;
        countOfStudents++;
    }

    public void addStudent(Student student) {
        System.out.println("New student: " + countOfStudents);
        students[countOfStudents] = student;
        countOfStudents++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverage() {
        for (int i = 0; i < countOfStudents ; i++) {
//            System.out.println("            " + students[i].getName() + ": " + students[i].getKnowledge());
            totalScore += students[i].getKnowledge();
        }
        return totalScore / countOfStudents;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getCountOfStudents() {
        return countOfStudents;
    }

    public void setCountOfStudents(int countOfStudents) {
        this.countOfStudents = countOfStudents;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
    
    
}
