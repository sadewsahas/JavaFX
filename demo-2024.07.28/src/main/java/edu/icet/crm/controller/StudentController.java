package edu.icet.crm.controller;

import edu.icet.crm.model.Student;
import edu.icet.crm.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/get-student")
    public Student getStd() {
        StudentService service = new StudentService();
        Student std = service.getStudent();
        System.out.println(std);

        return std;
    }



}
