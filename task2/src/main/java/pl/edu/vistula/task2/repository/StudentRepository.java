package pl.edu.vistula.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.vistula.task2.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
