package ru.lesson.springdatajpa_hw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lesson.springdatajpa_hw.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
