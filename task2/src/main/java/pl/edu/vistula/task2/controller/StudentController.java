package pl.edu.vistula.task2.controller;

import org.springframework.web.bind.annotation.*;
import pl.edu.vistula.task2.entity.Student;
import pl.edu.vistula.task2.repository.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // GET /students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // POST /students
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
}
