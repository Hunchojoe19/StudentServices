package hunchojoe.com.StudentService.services;

import hunchojoe.com.StudentService.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface StudentService {
    public Optional<Student> getStudentById(long id);
    public Student addStudent(Student student);
}
