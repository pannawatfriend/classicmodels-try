package sit.int204.classicmodelsservicetry.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sit.int204.classicmodelsservicetry.modles.Student;
import sit.int204.classicmodelsservicetry.services.StudentService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("")
    public Student getGrade(@RequestBody Student student){
        return service.calGrade(student);
    }
}
