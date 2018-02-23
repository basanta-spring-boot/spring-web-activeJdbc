package com.basant.spring.active.jdbc.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basant.spring.active.jdbc.api.ServiceData;
import com.basant.spring.active.jdbc.api.dao.PersonDAO;
import com.basant.spring.active.jdbc.api.model.Person;

@Service
public class PersonService {
	@Autowired
	private PersonDAO dao;

	public String save(ServiceData request) {
		Person p = new Person();
		p.set("id", request.getId());
		p.set("first_name", request.getFirstName());
		p.set("last_name", request.getLastName());
		boolean status = dao.addPerson(p);
		return "Record inserted status : " + status;
	}

	public List<Person> getPerson(String lastName) {
		List<Person> persons = dao.getPersonByLastName(lastName);
		System.out.println("Records : " + persons.get(0));
		return persons;
	}

	public List<Person> getPersons() {
		List<Person> persons = dao.getPersons();
		System.out.println("Records : " + persons);
		return persons;
	}

	public int deletePerson(String lastName) {
		return dao.deletePerson(lastName);
	}

	public String update(int id, String lastName) {
		return dao.update(id, lastName);

	}
}
