package src.com.varun;

public class Pet {

    private String name;
    private int age;

    private String location;

    private String type;

    public Pet() {

    }

    //Constructor with all attributes
    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;

    }

    //Getter for Name
    public String getName(){
        return this.name;
    }

    //Getter for Age
    public int getAge(){
        return this.age;
    }

    //Getter for Type
    public String getType(){
        return this.type;
    }

    //Getter for Location
    public String getLocation(){
        return this.location;
    }

    //Setter for Name
    public void setName(String name){
        this.name = name;
    }

    //Setter for Age
    public void setAge(int age){
        this.age = age;
    }

    //Setter for Type
    public void setType(String type){
        this.type = type;
    }

    //Setter for Location
    public void setLocation(String location){
        this.location = location;
    }
    public static void main(String[] args) {
        //Homework #1
        Pet pet1 = new Pet();
        pet1.setName("chinna");
        pet1.setAge(3);
        pet1.setLocation("Charlotte");
        pet1.setType("Dog");

        System.out.println("I have a "+pet1.getType()+" named "+pet1.getName()+" of age "+pet1.getAge()+" in "+pet1.getLocation()+".");

        Pet pet2 = new Pet("Eesha",7,"Fort Mill","Rabbit");

        System.out.println("I have ANOTHER "+pet2.getType()+" named "+pet2.getName()+" of age "+pet2.getAge()+" in "+pet2.getLocation()+".");


    }

}
