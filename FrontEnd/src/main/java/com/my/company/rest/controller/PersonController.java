package com.my.company.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.company.core.domain.Person;
import com.my.company.service.PersonService;

@RestController
@RequestMapping("/")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping("/")
	public String home() {
		Person person = new Person("Larry");
		personService.save(person);
		return "Welcome to my rest portal";
	}

	@RequestMapping("/all")
	public Iterable<Person> findAll() {
		return personService.findAll();
	}

}
