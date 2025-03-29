package lk.ac.vau.fas.ict.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;

@RestController
@Controller
@RequestMapping("/app")
public class AppController {
	@GetMapping("age/{ag}")
	public String MyAge(@PathVariable("ag") int age) {
		return "My age is "+age;
	}
	
	List <Student> students = new ArrayList<Student>();
    Student bob = new Student("2020IT01", "Bob Marley", 23, "IT", 3.2);
    Student alice = new Student("2020IT02", "Alice Corner", 24, "IT", 3.6);
    Student john = new Student("2020IT03", "John Parker", 23, "IT", 3.3);
    {
    	students.add(bob);
    	students.add(alice);
    	students.add(john);
    }
	
	@GetMapping("/student")
	public Student getStudent(){
	    return bob;
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
	    
	    return students;
	}
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") String regno) {
		for (Student student : students) {
			if(student.getRegno().equals(regno)) {
				return student;
			}
		}
		
		return null;
	}
	@GetMapping("/age-range")
	public List<Student> getStudentByAge() {
	    List<Student> result = new ArrayList<>();
	    for (Student student : students) {
	        if (student.getAge() >= 20 && student.getAge() <= 23) {
	            result.add(student);
	        }
	    }
	   return result; 

	}
}
