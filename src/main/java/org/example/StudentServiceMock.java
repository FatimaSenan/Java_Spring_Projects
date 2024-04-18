package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceMock implements StudentService {
    private List<Student> students = new ArrayList<>();

    @Override
    public void createStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
    @Override
    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
