package edu.icet.crm;

import edu.icet.crm.model.Student;
import edu.icet.crm.service.studentService;

public class Main {
    public static void main (String[] args) {

       studentService service = new studentService();
       Student student = service.getStudent();
        System.out.println(student);

    }
}
