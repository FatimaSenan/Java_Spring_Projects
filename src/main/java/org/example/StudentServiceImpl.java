package org.example;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository ;
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
        @Override
        public void createStudent(Student student){
            studentRepository.save(student);
        }

        @Override
        public Student getStudentById(int id){
            return studentRepository.findById(id);
        }
        @Override
        public void displayStudents() {
            List<Student> students = studentRepository.findAll();
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

