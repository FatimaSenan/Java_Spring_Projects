package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        StudentService studentService = context.getBean(StudentService.class);

        Student student1 = new Student();
        student1.setId(1);
        student1.setNom("SENAN");
        student1.setPrenom("Fatima");
        student1.setFiliere("Informatique");
        studentService.createStudent(student1);

        System.out.println("Liste des étudiants :");
        studentService.displayStudents();
        // Recherche d'un étudiant par ID
        int id= 1;
        Student studentSearch = studentService.getStudentById(id);
        if (studentSearch != null) {
            System.out.println("\nÉtudiant trouvé avec l'ID " + id+ " : " + studentSearch);
        } else {
            System.out.println("\nAucun étudiant trouvé avec l'ID " + id);
        }
    }
}
