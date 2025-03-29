package lk.ac.vau.fas.ict.controller;


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
	Student bob = new Student("2020IT01", "Bob Marley", 23, "IT", 3.2);
	
	@GetMapping("/student")
	public Student getStudent(){
	    return bob;
	}

}
