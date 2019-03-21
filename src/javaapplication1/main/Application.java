package main;
import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        
        Knowledge knowledge1 = new Knowledge(1);
        Knowledge knowledge2 = new Knowledge(2);
        Knowledge knowledge3 = new Knowledge(3);
        
//        System.out.println("List of knowledge:");
//        System.out.println(knowledge1.getLevel());
//        System.out.println(knowledge2.getLevel());
//        System.out.println(knowledge3.getLevel());
        
        Student student1 = new Student("Andrew Kostenko");
        Student student2 = new Student("Julia Veselkina");
        Student student3 = new Student("Maria Perechrest");
        
        student1.setKnowledge(knowledge1);
        student2.setKnowledge(knowledge2);
        student3.setKnowledge(knowledge3);
        
//        System.out.println("List of students:");
//        System.out.println(student1.getName());
//        System.out.println(student1.getKnowledge());
//        System.out.println(student2.getName());
//        System.out.println(student2.getKnowledge());
//        System.out.println(student3.getName());
//        System.out.println(student3.getKnowledge());
        
        University university = new University("CH.U.I.");
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.getStudents().forEach(System.out::print);
        
        System.out.println();
        
        System.out.println("Count of the students in the university: " + university.getStudents().size());
        System.out.println("Average level of the knowledge by the university: " + university.getAverage());
        
        Internship internship = new Internship("Interlink");
        System.out.println("Add students to the intership:");
        int avg = university.getAverage();
        for (Student student : university.getStudents()) {
            if(student.getKnowledge().getLevel() > avg)
                internship.setStudent(student);
        }
        System.out.println("Students in the intership: ");
        internship.getStudents().forEach(System.out::print);
        
    }
}
