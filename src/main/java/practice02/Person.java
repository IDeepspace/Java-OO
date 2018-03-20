package practice02;

public class Person {

    private String name;
    private int age;

    public Person(String myName, int  myAge) {
        this.name = myName;
        this.age = myAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + this.name +". I am " + this.age + " years old.";
    }
}
