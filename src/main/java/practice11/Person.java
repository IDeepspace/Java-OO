package practice11;

public class Person {

    private int id;

    private String name;

    private int age;


    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }

    @Override
    public boolean equals(Object object){
        if(object instanceof Person){
            Person p = (Person) object;
            if(p.getName() == null || name == null){
                return false;
            }
            else{
                return name.equalsIgnoreCase(p.getName());
            }
        }
        return false;
    }
}
