package L29_LambdaExpressions;

import java.util.ArrayList;
import java.util.function.*;

// Lambda expressions works with interfaces w/ only 1 method.
// Such interfaces calls functional interfaces, that is interfaces,
// ready fir functional programming.

/**

public interface Predicate<T> {
 boolean test(T t);
 }

 // Predicate <T> - generic syntax

 */

/**
 there is no interface like in c4l4

interface Test5 {
    int abc(String s);

 Cause interface Predicate works the same
 */

public class c5l5_InterfacePredicate {
}

class Student5 {

    // Student fields
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student5(String name, char sex, int age, int course, double avgGrade) {
        this.age = age;
        this.avgGrade = avgGrade;
        this.name = name;
        this.course = course;
        this.sex = sex;
    }
}

class PrintStudentInfo5 {

    void printStudentInfo3(Student5 s5) {
        System.out.println("Name: " + s5.name);
        System.out.println("Age: " + s5.age);
        System.out.println("Sex: " + s5.sex);
        System.out.println("Course: " + s5.course);
        System.out.println("Average grade: " + s5.avgGrade);
    }

    void testStudents(ArrayList<Student5> sal5, Predicate<Student5> t) {
        for (Student5 s5 : sal5) {
            if (t.test(s5)) {
                printStudentInfo3(s5);
                System.out.println("---------------");
            }
        }
    }

    public static void main(String[] args) {

        // Create students
        Student5 s5 = new Student5("Ivan", 'M', 18, 1, 8.1);
        Student5 s51 = new Student5("Stanislav", 'M', 18, 2, 9.1);
        Student5 s52 = new Student5("Ekaterine", 'F', 20, 3, 10);
        Student5 s53 = new Student5("Ilya", 'M', 19, 3, 10);
        Student5 s54 = new Student5("Mark", 'M', 20, 1, 10);
        Student5 s55 = new Student5("Hanna", 'F', 18, 1, 8.5);

        ArrayList<Student5> sal5 = new ArrayList<>();

        sal5.add(s5);
        sal5.add(s51);
        sal5.add(s52);
        sal5.add(s53);
        sal5.add(s54);
        sal5.add(s55);

        PrintStudentInfo5 psi5 = new PrintStudentInfo5();

        // Lambda expression == anon method
        // Type of functional programming
//        psi3.testStudents(sal3, /*test*/(Student3 st3) -> {return st3.avgGrade > 8.5;});
        //                                          st3  -> st.avgGrade          > 8.5
//        psi3.testStudents(sal3, st3 ->  st3.avgGrade > 8.5); // short way
        psi5.testStudents(sal5, st5 -> {
            int x = 1;
            return st5.avgGrade > 8.5;
        }); // if 2 statements
        //                       may be short or long before and after -> operator
        System.out.println("===============");

        sal5.removeIf(st5 -> st5.name.endsWith("a"));
        for (Student5 st5 : sal5) {
            System.out.println(st5.name);
        }
    }
}
