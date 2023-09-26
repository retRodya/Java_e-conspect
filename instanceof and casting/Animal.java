package Lesson25.Homework;

public  class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }
    void eat(){
        System.out.println("Animal eats");
    };
    void sleep(){
        System.out.println("Animal speeps");
    };

    public String toString() {
        return name;
    }
}
