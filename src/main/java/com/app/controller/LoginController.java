package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.modal.User;
import com.app.repo.UserRepo;


@Controller
public class LoginController {
	@Autowired
	UserRepo userRepository;
	
	
	
	@RequestMapping(value="/api/login", method=RequestMethod.POST, produces="application/json")
	@ResponseBody User login(@ModelAttribute("login") User user1)
	{
		User user=userRepository.findByUserNameAndPassword(user1.getUserName(), user1.getPassword());
		return  user;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute("login") User user1, Model model)
	{
		User user=userRepository.findByUserNameAndPassword(user1.getUserName(), user1.getPassword());
		String page="login";
		if(user.isValid())
		{
			page="greeting";
		}
		model.addAttribute("name", user.getUserName());
		return page;
	}

}
