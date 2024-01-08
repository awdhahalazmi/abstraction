package test;

public class Teacher extends Person {
    // private static Teacher instance;
    public String subject;
    public String school;
    public int classesNumber;

    public Teacher(String name, String subject, String school, int classesNumber) {
        super(name);
        this.subject = subject;
        this.school = school;
        this.classesNumber = classesNumber;
    }

    // public static Teacher getinstance() {
    // return instance;
    // }

    // public static void setinstance(Teacher instance) {
    // Teacher.instance = instance;
    // }

    public String getsubject() {
        return subject;
    }

    public void setsubject(String subject) {
        this.subject = subject;
    }

    public String getschool() {
        return school;
    }

    public void setschool(String school) {
        this.school = school;
    }

    public int getclassesNumber() {
        return classesNumber;
    }

    public void setclassesNumber(int classesNumber) {
        this.classesNumber = classesNumber;
    }

    @Override
    void describeRole() {
        System.out.println(getName() + " is a teacher that teaches in " + school + " and they have this number "
                + classesNumber + " of classes ");

    }
}
