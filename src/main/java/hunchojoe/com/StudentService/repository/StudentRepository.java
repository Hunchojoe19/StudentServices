package hunchojoe.com.StudentService.repository;

import hunchojoe.com.StudentService.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
