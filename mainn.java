package test;

public class mainn {
    public static void main(String[] args) {
        // Teacher teacher = Teacher.getinstance();
        // teacher.setschool("khaledah high school");
        // teacher.setsubject("English");
        // teacher.setclassesNumber(4);
        Teacher hind = new Teacher("Hind", "English", "Khaledah High School", 4);

        hind.describeRole();

        // System.out.println( hind:describeRole());
        // System.out.println(teacher.getclassesNumber());
        // System.out.println(teacher.getschool());
        // System.out.println(teacher.getsubject());
    }

}
