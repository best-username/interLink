package person;

import person.consciousness.Knowledge;

public class Student {
    
    private String name;
    private Knowledge knowledge;
    
    // constructor to set up the initial values to an object
    public Student(String name) {
        this.name = name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }
    
    @Override public String toString() {
        return "\nName: " + name + "   Knowledge: " + knowledge.getLevel() + "\n";
    }

}
