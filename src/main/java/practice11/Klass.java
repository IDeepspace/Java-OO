package practice11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Klass {

    private Student leader;

    private int number;

    private List<StuJoinListener> stuJoinJoinListeners = new ArrayList<StuJoinListener>();
    private List<AppointLeaderListener> appointLeaderListeners = new ArrayList<AppointLeaderListener>();



    public Klass(int number) {
        this.number = number;

        this.stuJoinJoinListeners = new ArrayList<>();
        this.appointLeaderListeners = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().equals(this)) {
            this.leader = student;
            for (AppointLeaderListener leaderListener : appointLeaderListeners) {
                leaderListener.appointLeaderListener(student,this);
            }
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);

        for (StuJoinListener joinObserver : stuJoinJoinListeners) {
            joinObserver.stuJoinListener(student,this);
        }
    }

    public boolean isIn(Student student) {
        return student.getKlass().equals(this);
    }

    public void registerJoinListener(StuJoinListener joinListener) {
        System.out.println(joinListener);
        this.stuJoinJoinListeners.add(joinListener);
    }

    public void registerLeaderListener(AppointLeaderListener leaderListener) {
        this.appointLeaderListeners.add(leaderListener);
    }
}

