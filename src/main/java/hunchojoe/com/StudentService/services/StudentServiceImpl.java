package hunchojoe.com.StudentService.services;

import hunchojoe.com.StudentService.entity.Student;
import hunchojoe.com.StudentService.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Optional<Student> getStudentById(long id) {
       return studentRepository.findById(id);
    }

    @Override
    public Student addStudent(Student student) {

        return studentRepository.save(student);
    }

}
