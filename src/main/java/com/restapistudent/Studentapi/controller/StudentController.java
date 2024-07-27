package com.restapistudent.Studentapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapistudent.Studentapi.services.TestServices;


@RestController
public class StudentController {
	@Autowired
	TestServices testservices;
	@RequestMapping("/page1")
	public String firstmethod(){
		return "This is SB project";
		
	}
	@GetMapping("/page2")
	public List<String> secondmethod(){
		return testservices.GetData();
	
	}
	
	

}
