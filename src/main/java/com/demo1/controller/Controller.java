package com.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo1.entity.DemoData;

@RestController
public class Controller {

	
	@GetMapping("/send")
	public String Display()
	{
		
		return "Hello java";
	}
	
	@PostMapping("/savedata")
	public String savedata(@RequestBody DemoData demoData) {
		
		
		return "";
	}
	
	
}
