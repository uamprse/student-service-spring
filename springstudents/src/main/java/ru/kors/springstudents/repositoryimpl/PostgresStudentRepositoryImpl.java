package ru.kors.springstudents.repositoryimpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kors.springstudents.model.Student;
import ru.kors.springstudents.repository.StudentRepository;

import java.util.List;


@Repository
public class PostgresStudentRepositoryImpl implements StudentRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Student> findAllStudent() {
        return entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }

    @Override
    public Student saveStudent(Student student) {
        entityManager.persist(student);
        return student;
    }

    @Override
    public Student findStudentByEmail(String email) {
        return entityManager.createQuery("SELECT s FROM Student s WHERE s.email = :email", Student.class)
                .setParameter("email", email)
                .getSingleResult();
    }

    @Override
    @Transactional
    public Student updateStudent(Student student) {
        return entityManager.merge(student);
    }

    @Override
    @Transactional
    public void deleteByEmail(String email) {
        Student student = findStudentByEmail(email);
        if (student != null) {
            entityManager.remove(student);
        }
    }
}
