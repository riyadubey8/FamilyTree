import java.util.ArrayList;

public class Child extends Person {
    protected Parent mother;
    protected Parent father;
    protected ArrayList<Child> children = new ArrayList<>();

    public Child(String name, int age, String gender, String hairColor, String eyeColor, String race, Parent mother, Parent father){
        super(name, age, gender, hairColor, eyeColor, race);
        this.mother = mother;
        this.father = father;    
    } 

    public Parent getMother(){
        return mother;
    }

    public Parent getFather(){
        return father;
    }

    @Override
    public String toString(){
        String motherName = (mother != null) ? mother.getName() : "Unknown";
        String fatherName = (father != null) ? father.getName() : "Unknown";
        return super.toString() + 
        "\n Mother: " + motherName +
        "\n Father: " + fatherName;
    }  
}
