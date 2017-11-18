package com.java.services;

import com.java.models.Person;
import com.java.models.Response;

public interface PersonService {
public Response addPerson(Person p);
	
	public Response deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();
}
