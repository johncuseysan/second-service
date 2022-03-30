package org.cusey.john.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cornell")
public class CornellController {
	
	@GetMapping("/student")
	public String studentInfo() {
		
		return "John Cusey";
	}

}
