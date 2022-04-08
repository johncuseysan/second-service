package org.cusey.john.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cornell")
public class CornellController {
	
	
	//http://localhost:8083/cornell/api/dean
	@GetMapping("/api/dean")
	public String studentInfo() {
		
		return "John Cusey";
	}

}
