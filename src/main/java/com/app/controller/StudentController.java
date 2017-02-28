package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.repo.StudentRepository;



@Controller
public class StudentController {
	@Autowired
	StudentRepository studentRepository;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String listOfStudents(Model model)
	{
		model.addAttribute("students", studentRepository.findAll());
		return "students";
		
	}

	
}

