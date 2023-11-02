package L29_LambdaExpressions;

import java.util.ArrayList;

public class c3l3_LambdaExpressions {
}

class Student3 {

    // Student fields
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student3(String name, char sex, int age, int course, double avgGrade) {
        this.age = age;
        this.avgGrade = avgGrade;
        this.name = name;
        this.course = course;
        this.sex = sex;
    }
}

class PrintStudentInfo3 {

    void printStudentInfo3(Student3 s3) {
        System.out.println("Name: " + s3.name);
        System.out.println("Age: " + s3.age);
        System.out.println("Sex: " + s3.sex);
        System.out.println("Course: " + s3.course);
        System.out.println("Average grade: " + s3.avgGrade);
    }

    void testStudents(ArrayList<Student3> sal3, StudentChecks sc) {
        for (Student3 s3 : sal3) {
            if (sc.test(s3)) {
                printStudentInfo3(s3);
            }
        }
    }

    public static void main(String[] args) {

        // Create students
        Student3 s3 = new Student3("Ivan", 'M', 18, 1, 8.1);
        Student3 s31 = new Student3("Stanislav", 'M', 18, 2, 9.1);
        Student3 s32 = new Student3("Ekaterine", 'F', 20, 3, 10);
        Student3 s33 = new Student3("Ilya", 'M', 19, 3, 10);
        Student3 s34 = new Student3("Mark", 'M', 20, 1, 10);
        Student3 s35 = new Student3("Hanna", 'F', 18, 1, 8.5);

        ArrayList<Student3> sal3 = new ArrayList<>();

        sal3.add(s3);
        sal3.add(s31);
        sal3.add(s32);
        sal3.add(s33);
        sal3.add(s34);
        sal3.add(s35);

        PrintStudentInfo3 psi3 = new PrintStudentInfo3();

        // Lambda expression == anon method
        // Type of functional programming
//        psi3.testStudents(sal3, /*test*/(Student3 st3) -> {return st3.avgGrade > 8.5;});
        //                                          st3  -> st.avgGrade          > 8.5
//        psi3.testStudents(sal3, st3 ->  st3.avgGrade > 8.5); // short way
        psi3.testStudents(sal3, st3 -> { int x = 1; return st3.avgGrade > 8.5;}); // if 2 statements
        //                       may be short or long before and after -> operator
    }
}

interface StudentChecks {
    boolean test(Student3 st3);
}
