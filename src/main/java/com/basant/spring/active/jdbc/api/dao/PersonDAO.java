package com.basant.spring.active.jdbc.api.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.basant.spring.active.jdbc.api.model.Person;

@Repository
public class PersonDAO {

	public boolean addPerson(Person person) {
		return person.insert();
	}

	public List<Person> getPersonByLastName(String lastName) {
		return Person.where("last_name=?", lastName);
	}

	public List<Person> getPersons() {
		return Person.findAll();
	}

	public int deletePerson(String lastName) {
		return Person.delete("last_name=?", lastName);
	}

	public String update(int id, String lastName) {
		Person person = (Person) Person.where("id=?", id).get(0);
		person.set("last_name", lastName);
		return "updated " + person.insert();

	}
}
