package com.moretolearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/save")
public class PersonController {

	@Autowired
	PersonRepository personRepository;
	
	
	@GetMapping
	public String saveData() {
		Person pm = new Person(103, "Narendra", 65);
		personRepository.save(pm);
		return "";
	}
	
	
	
}
