package hunchojoe.com.StudentService.controller;

import hunchojoe.com.StudentService.entity.Library;
import hunchojoe.com.StudentService.entity.Student;
import hunchojoe.com.StudentService.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/add_student")
    public Student addStudent (@RequestBody Student student){
     return studentService.addStudent(student);
    }

    @GetMapping("/get_student/{id}")
    public Optional<Student> getStudent(@PathVariable long id){

        Library library = restTemplate.getForObject("http://localhost:9290/api/v1/library/get_library/"+id, Library.class);
        Student student = studentService.getStudentById(id).get();
        student.setLibrary(library);
        return Optional.of(student);
    }

}
