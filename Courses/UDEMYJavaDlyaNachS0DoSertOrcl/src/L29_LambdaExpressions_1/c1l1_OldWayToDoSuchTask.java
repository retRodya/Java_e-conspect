package L29_LambdaExpressions;

import java.util.ArrayList;
public class c1l1_OldWayToDoSuchTask {
}

class Student1 {

    // Student fields
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student1(String name, char sex, int age, int course, double avgGrade) {
        this.age = age;
        this.avgGrade = avgGrade;
        this.name = name;
        this.course = course;
        this.sex = sex;
    }
}

class PrintStudentInfo {

    void printStudentInfo (Student1 st) {
        System.out.println("Name: " + st.name);
        System.out.println("Age: " + st.age);
        System.out.println("Sex: " + st.sex);
        System.out.println("Course: " + st.course);
        System.out.println("Average grade: " + st.avgGrade);
    }
    void printStudentOverGrade (ArrayList <Student1> studentAL, double avgGrade) {
        for (Student1 st : studentAL) {
            if (st.avgGrade >= avgGrade) {
                System.out.println("---------------");
                printStudentInfo(st);
            }
        }
    }
    void printStudentSex (ArrayList <Student1> studentAL, char sex) {
        int count = 0;
        for (Student1 st : studentAL) {
            if (st.sex == sex) {
                System.out.println("---------------");
                printStudentInfo(st);
                count++;
            }
        }
        System.out.println("_________");
        System.out.println("[" + sex + " in total " + count + "]");
    }
    void printStudentOverGradeSex (ArrayList <Student1> studentAL, double avgGrade, char  sex) {
        int count = 0;
        for (Student1 st : studentAL) {
            if (st.avgGrade >= avgGrade && st.sex == sex) {
                System.out.println("---------------");
                printStudentInfo(st);
                count++;
            }
        }
        System.out.println("_______________");
        System.out.println("[" + sex + " > " + avgGrade + " in total " + count + "]");
    }
}

class Main1 {
    public static void main(String[] args) {

        // Create students
        Student1 st1 = new Student1("Ivan", 'M', 18, 1, 8.1);
        Student1 st11 = new Student1("Stanislav", 'M', 18, 2, 9.1);
        Student1 st12 = new Student1("Ekaterine", 'F', 20, 3, 10);
        Student1 st13 = new Student1("Ilya", 'M', 19, 3, 10);
        Student1 st14 = new Student1("Mark", 'M', 20, 1, 10);
        Student1 st15 = new Student1("Hanna", 'F', 18, 1, 8.5);

        ArrayList <Student1> studentAL1 = new ArrayList<>();

        studentAL1.add(st1);
        studentAL1.add(st1);
        studentAL1.add(st12);
        studentAL1.add(st13);
        studentAL1.add(st14);
        studentAL1.add(st15);

        PrintStudentInfo psi = new PrintStudentInfo();


        psi.printStudentOverGrade(studentAL1, 9);
        System.out.println("===============");
        psi.printStudentSex(studentAL1, 'M');
        System.out.println("===============");
        psi.printStudentSex(studentAL1, 'F');
        System.out.println("===============");
        psi.printStudentOverGradeSex(studentAL1, 9, 'M');
        System.out.println("===============");
        psi.printStudentOverGradeSex(studentAL1, 9, 'F');
    }
}