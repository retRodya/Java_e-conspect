package L29_LambdaExpressions_1;

import java.util.ArrayList;

public class NewWayToDoSuchTask {
}
class Student2 {

        // Student fields
        String name;
        char sex;
        int age;
        int course;
        double avgGrade;

        Student2(String name, char sex, int age, int course, double avgGrade) {
            this.age = age;
            this.avgGrade = avgGrade;
            this.name = name;
            this.course = course;
            this.sex = sex;
        }
}

class PrintStudentInfo2 {

    void printStudentInfo2(Student2 s2) {
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
        System.out.println("Sex: " + s2.sex);
        System.out.println("Course: " + s2.course);
        System.out.println("Average grade: " + s2.avgGrade);
    }

    void checkStudent (ArrayList <Student2> studentAL2, StudentCheck sC) {
        for (Student2 s2 : studentAL2) {
            if (sC.studentCheck(s2)) {
                System.out.println("---------------");
                printStudentInfo2(s2);
            }
        }
    }
}

interface StudentCheck {
    boolean studentCheck (Student2 s2);
}

class checkStudentOverGrade implements StudentCheck {
    public boolean studentCheck (Student2 s2) {
        return s2.avgGrade >= 9;
    }
}

class Main2 {
    public static void main(String[] args) {

        // Create students
        Student2 st2 = new Student2("Ivan", 'M', 18, 1, 8.1);
        Student2 st21 = new Student2("Stanislav", 'M', 18, 2, 9.1);
        Student2 st22 = new Student2("Ekaterine", 'F', 20, 3, 10);
        Student2 st23 = new Student2("Ilya", 'M', 19, 3, 10);
        Student2 st24 = new Student2("Mark", 'M', 20, 1, 10);
        Student2 st25 = new Student2("Hanna", 'F', 18, 1, 8.5);

        ArrayList <Student2> sal2 = new ArrayList<>();

        sal2.add(st2);
        sal2.add(st21);
        sal2.add(st22);
        sal2.add(st23);
        sal2.add(st24);
        sal2.add(st25);

        PrintStudentInfo2 psi2 = new PrintStudentInfo2();
        checkStudentOverGrade csog = new checkStudentOverGrade();
        psi2.checkStudent(sal2, csog);
    }
}

// new, but still a lot of time


