package controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.Course;
import service.StudentService;

@RestController 
public class StudentController{

    @Autowired
    priivate StudentService studentService;

    @GetMapping("/students/{studentId}/courses")
    public List<Course> retrieveCoursesForStudent(@PathVariable String studentId){
        return studentService.retrieveCourses(studentId);
    }

    @GetMapping("/students/{studentId}/courses/{courseId}")
    public Course retreiveDetailsForCourse(@PathVariable String studentId,
     @PathVariable String courseId){

        return studentService.retrieveCourses(studentId, courseId);

    }
}
