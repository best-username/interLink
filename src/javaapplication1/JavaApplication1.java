package javaapplication1;
import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class JavaApplication1 {
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
        
        student1.setKnowledge(knowledge3);
        student2.setKnowledge(knowledge2);
        student3.setKnowledge(knowledge2);
        
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

        System.out.println("Count of students in the university:" + university.getCountOfStudents());
        System.out.println("Average by university: " + university.getAverage());
//        System.out.println(student2.getName());
//        System.out.println(student2.getKnowledge());
//        System.out.println(student3.getName());
//        System.out.println(student3.getKnowledge());
        
//        Internship internship = new Internship("Interlink");
//        System.out.println("List of internship's students:");
//        System.out.println(internship.setStudent(student3));
//        System.out.println(internship.getStudents());
        
    }
}
