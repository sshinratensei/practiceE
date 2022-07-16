package task3;

import java.util.*;

public class Deanery {
    public static int START_COURSE = 1;
    public static int FINISH_COURSE = 5;

    private List<Student> students;
    private List<Student> graduates;

    public Deanery() {
        students = new LinkedList<>();
        graduates = new LinkedList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getGraduates() {
        return graduates;
    }

    public void setGraduates(List<Student> graduates) {
        this.graduates = graduates;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void fillStudentsList() {
        students.add(new Student("A A A", 5, "GR330"));
        students.add(new Student("B B B", 4, "GR530"));
        students.add(new Student("C C C", 3, "GR130"));
        students.add(new Student("D D D", 2, "GR230"));
        students.add(new Student("E E E", 1, "GR130"));
        students.add(new Student("F F F", 5, "GR530"));
        students.add(new Student("G G G", 4, "GR430"));
        students.add(new Student("H H H", 3, "GR230"));
        students.add(new Student("I I I", 2, "GR330"));
        students.add(new Student("J J J", 1, "GR230"));
        students.add(new Student("K K K", 5, "GR430"));
        students.add(new Student("L L L", 4, "GR330"));
    }

    public void fillStudentsSummaryList() {
        for (Student student : students) {
            student.fillSummaryList();
        }
    }

    public void printStudentsInfo() {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public void printGraduatesInfo() {
        for (Student graduate : graduates) {
            System.out.println(graduate);
        }
        System.out.println();
    }

    public void makeDecision() {
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (averageMark(student) >= 3) {
                student.updateCourse();
                if (student.isGraduate()) {
                    iterator.remove();
                    graduates.add(student);
                } else {
                    iterator.set(student);
                }
            } else {
                iterator.remove();
            }
        }
    }

    public double averageMark(Student student) {
        double averageMark = 0;
        for (Integer integer : student.getResults().values()) {
            averageMark += integer;
        }
        averageMark /= student.subjectsNumber();
        return averageMark;
    }
}
