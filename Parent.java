import java.util.ArrayList;

public class Parent extends Person {
    private ArrayList<Child> children;


    public Parent(String name, int age, String gender, String hairColor, String eyeColor, String race){
        super(name, age, gender, hairColor, eyeColor, race);
        this.children = new ArrayList<>();
    }

    public ArrayList<Child> getChildren(){
        return children;
    }

    public void addChild(Child child){
        children.add(child);
    }

    @Override
    public String toString(){
        int numChildren = children.size();

        if(numChildren == 0){
            return "Children: None";
        } else if(numChildren == 1){
            return "Child: " + children.get(0).getName();
        } else {
            StringBuilder childNames = new StringBuilder();
            for(Child c: children){
                childNames.append(c.getName()).append(", ");
            }
            childNames.setLength(childNames.length() - 2);
            return super.toString() +
            "\n Children: " + childNames.toString();
        } 
    }
    }


