import java.util.ArrayList;

public class Person{
    protected String name;
    protected int age;
    protected String gender;
    protected String hairColor;
    protected String eyeColor;
    protected String race;

    //Constructor
    public Person(String name, int age, String gender, String hairColor, String eyeColor, String race){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.race = race;
    }

    //main
    public static void main(String[] args){
        Parent sandhya = new Parent("Sandhya", 45, "Female", "Black ", "Brown", "Indian");
        Parent abhinav = new Parent("Abhinav", 48, "Male", "Black", "Brown", "Indian");
        Child riya = new Child("Riya", 15, "Female", "Black", "Brown", "Indian", sandhya, abhinav);
        Child asha = new Child("Asha", 13, "Female", "Black", "Brown", "Indian", sandhya, abhinav);

        sandhya.addChild(riya);
        abhinav.addChild(riya);
        sandhya.addChild(asha);
        abhinav.addChild(asha);

        ArrayList<Person> family = new ArrayList<>();
        family.add(abhinav);
        family.add(sandhya);
        family.add(riya);
        family.add(asha);

        for(Person person: family){
            System.out.println(person);
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String getHairColor(){
        return hairColor;
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public String getRace(){
        return race;
    }

    public String toString(){
        return 
        "Name: " + name +
        "\n Age: " + age +
        "\n Gender: " + gender +
        "\n Hair Color: " + hairColor +
        "\n Eye Color: " + eyeColor +
        "\n Race/Ethnicity: " + race;
    }
        
    




    
}