package pro.ofitserov.stepik.functionalprogramming.practicallessons.t13;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class Step {

    /**
     * 2.13 Usage of comparators and composition for sorting
     * Let's assume there is class Student exists. Each student has a name and a grade for exam in computer science.
     * <p>
     * You need to understand in what order the list will be sorted by the code below.
     * <p>
     * List<Student> students = ...
     * <p>
     * students.sort(
     * comparing(Student::getCsGrade, reverseOrder())
     * .thenComparing(Student::getName));
     * <p>
     * Note. The method getName() returns name of the student, getCsGrade() returns a grade for exam.
     * <p>
     * PS: see, the functional features in Java 8 allow us to write more concise code. In the previous version, the code would be less readable.
     */

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Vladimir", 94));
        students.add(new Student("Elizabet", 97));
        students.add(new Student("Francis", 85));
        students.add(new Student("Antonio", 85));
        students.add(new Student("Alisa", 100));
        students.add(new Student("John", 100));
        students.add(new Student("Mary", 82));

        students.sort(
                comparing(Student::getCsGrade, reverseOrder())
                        .thenComparing(Student::getName));

        System.out.println(students);

        //[Student(name=Alisa, csGrade=100), Student(name=John, csGrade=100), Student(name=Elizabet, csGrade=97), Student(name=Vladimir, csGrade=94), Student(name=Antonio, csGrade=85), Student(name=Francis, csGrade=85), Student(name=Mary, csGrade=82)]
    }
}
