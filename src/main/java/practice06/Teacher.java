package practice06;

public class Teacher extends Person {

    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }


    private String isTeaching(String klassNum) {
        return super.introduce() + " I am a Teacher. I teach " + klassNum + ".";
    }

    @Override
    public String introduce() {

        if (this.klass == 0) {
            return isTeaching("No Class");
        }else {
            return isTeaching("Class " + this.klass);
        }
    }

}
