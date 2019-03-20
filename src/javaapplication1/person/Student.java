package person;

import person.consciousness.Knowledge;

public class Student {
    
    private String name;
    private int knowledge;
    
    // constructor to set up the initial values to an object
    public Student(String name) {
        this.name = name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge.getLevel();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKnowledge() {
        return knowledge;
    }

}
