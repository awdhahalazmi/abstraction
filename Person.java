package test;

abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void describeRole(); // i removed the curly brackets so that i use it in the subclass

}
