package com.basant.spring.active.jdbc.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basant.spring.active.jdbc.api.ServiceData;
import com.basant.spring.active.jdbc.api.model.Person;
import com.basant.spring.active.jdbc.api.service.PersonService;

@RestController
@RequestMapping("/activeJdbc")
public class PersonController {

	@Autowired
	private PersonService service;

	@PostMapping("/addPerson")
	public String savePerson(@RequestBody ServiceData request) {
		return service.save(request);
	}

	@GetMapping("/getPersonByName/{name}")
	public List<Person> getPersonByName(@PathVariable String name) throws Exception {
		return service.getPerson(name);
	}

	@GetMapping("/getPersons")
	public List<Person> getPersons() {
		List<Person> persons = service.getPersons();
		return persons;
	}

	@DeleteMapping("/delete/{lastName}")
	public int deletePerson(@PathVariable String lastName) {
		return service.deletePerson(lastName);
	}

	@PutMapping("/update/{id}/{lastName}")
	public String update(@PathVariable int id, @PathVariable String lastName) {
		return service.update(id, lastName);

	}
}
