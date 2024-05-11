Важно!

Данное приложение представляет собой учебный пример и не предназначено для использования в реальных проектах без соответствующей доработки и обеспечения безопасности

Учебный проект "Управление студентами Spring"

Основные компоненты проекта:

1. StudentController
StudentController является REST контроллером, который обрабатывает HTTP запросы и делегирует их соответствующим сервисам.

2. StudentService
StudentService предоставляет методы для выполнения операций с объектами студента.

3. PostgresStudentRepositoryImpl
PostgresStudentRepositoryImpl - это реализация репозитория для доступа к данным студентов. В данной версии проекта используется простой список для хранения студентов.

4. Student
Student представляет модель данных студента, которая включает в себя основные атрибуты, такие как имя, фамилия, дата рождения и адрес электронной почты.

Технологии

Java
Spring Framework (Spring Boot, Spring MVC, Spring Data JPA)
Lombok
PostgreSQL

Использование API

Получение всех студентов: GET /api/v1/students
Получение студента по электронной почте: GET /api/v1/students/{email}
Сохранение студента: POST /api/v1/students/save_student
Обновление данных студента: PUT /api/v1/students/update_student
Удаление студента по электронной почте: DELETE /api/v1/students/delete_student/{email}