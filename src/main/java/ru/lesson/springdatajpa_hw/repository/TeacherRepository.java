package ru.lesson.springdatajpa_hw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lesson.springdatajpa_hw.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
