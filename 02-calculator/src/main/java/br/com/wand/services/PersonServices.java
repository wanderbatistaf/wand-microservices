package br.com.wand.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.wand.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong(); //<-- Serve para simular um ID de banco de dados
	
	public Person create(Person person) {
		return person;
		
	}
	
	public Person update(Person person) {
		return person;
		
	}
	
	public void delete(String id) {
		
	}
	
	public Person findById(String id) {
		Person person = new Person();
		person.setID(counter.incrementAndGet()); //<-- Gera o numero, pega e incremeta
		person.setFirstName("Wand");
		person.setLastName("Freitas");
		person.setAdress("Vila Velha - Espirito Santo - Brasil");
		person.setGender("Male");
		return person ;
		
	}
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < 8; i++) {
			Person person = mmockPerson(i);
			persons.add(person);
		}
		return persons;
	}

	private Person mmockPerson(int i) {
		Person person = new Person();
		person.setID(counter.incrementAndGet()); //<-- Gera o numero, pega e incremeta
		person.setFirstName("Person name" + i);
		person.setLastName("Last name" + i);
		person.setAdress("Some address in Brazil" + i);
		person.setGender("Male");
		return person ;
	}

}
