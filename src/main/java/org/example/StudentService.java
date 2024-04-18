package org.example;

public interface StudentService {
    void createStudent(Student student);
    Student getStudentById(int id);
    void displayStudents();
}
