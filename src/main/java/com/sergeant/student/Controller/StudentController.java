package com.sergeant.student.Controller;

import com.sergeant.student.Entity.Student;
import com.sergeant.student.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;



    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents(){
        return ResponseEntity.ok(studentService.findAllStudents());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @GetMapping("/school/{school-id}")
    public ResponseEntity<List<Student>> findAllStudents(@PathVariable("school-id") Integer schoolId){
        return ResponseEntity.ok(studentService.findAllStudentsBySchool(schoolId));
    }
}
