package com.sergeant.student.Service;

import com.sergeant.student.Entity.Student;
import com.sergeant.student.Reposotiry.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;


    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }

    public List<Student> findAllStudentsBySchool(Integer schoolId){
        return studentRepository.findAllBySchoolId(schoolId);
    }
}
