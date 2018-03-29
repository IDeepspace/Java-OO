package practice08;

public class Teacher extends Person {

    private Klass klass;

    public Teacher(int id, String name, int age) {

        super(id, name, age);
    }

    public Teacher(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }

    public Klass getKlass() {

        return klass;
    }

    private String isTeaching(String klassNum) {
        return super.introduce() + " I am a Teacher. I teach " + klassNum + ".";
    }

    @Override
    public String introduce() {

        if (this.klass == null) {
            return isTeaching("No Class");
        }else {
            return isTeaching(this.klass.getDisplayName());
        }
    }

    public String introduceWith(Student student) {

        if (student.getKlass() == this.klass) {
            return isTeaching(student.getName());
        }else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

}

