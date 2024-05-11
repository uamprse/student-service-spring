package ru.kors.springstudents.repository;


import ru.kors.springstudents.model.Student;

import java.util.List;


public interface StudentRepository {
    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findStudentByEmail(String email);
    Student updateStudent(Student student);
    void deleteByEmail(String email);
}

