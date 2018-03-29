package practice11;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Teacher extends Person {

    private Set<Klass> classes;

    public Teacher(int id,String name, int age, Set<Klass> classes) {
        super(id,name, age);
        this.classes = classes;
    }

    public Teacher(int id,String name, int age) {
        super(id,name, age);
    }

    public Set<Klass> getClasses() {
        return classes;
    }

    public String introduceWith(Student student){

        if(this.isTeaching(student)) {
            return teach(student.getName());
        }else {
            return doNotTeach(student.getName());
        }
    }


    public boolean isTeaching(Student student) {
        return this.getClasses().contains(student.getKlass());
    }

    @Override
    public String introduce() {

        String words = basicIntroduce()+ " I teach Class";

        if (this.classes != null) {
            for (Klass str : classes) {
                words += String.format(" %d,", str.getNumber());
            }

            char[] items = words.toCharArray();
            items[items.length-1] = '.';

            words = new String(items);

            return words;

        }else {
            return teach("No Class");
        }

    }

    private String teach(String name) {
        return basicIntroduce() + " I teach " + name + ".";
    }

    private String doNotTeach(String name) {
        return basicIntroduce() + " I don't teach " + name + ".";
    }

    private String basicIntroduce() {
        return super.introduce() + " I am a Teacher.";
    }

}
