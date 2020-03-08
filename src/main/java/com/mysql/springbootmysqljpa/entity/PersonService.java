package com.mysql.springbootmysqljpa.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;

	


	
	
	public void insertDummyPersonRecords() {
		
		Person person1 = new Person("teju", "Sahu", "teju@gmail.com", 5);
		Person person2 = new Person("Tapnesh", "Dash", "tapan@gmail.com", 6);
		Person person3 = new Person("Rakesh", "Mohanti", "rakesh@gmail.com", 7);
		Person person4 = new Person("Satya", "Padhi", "satya@gmail.com", 8);
		
		List<Person> listOfPersons = new ArrayList<>();
		listOfPersons.add(person1);
		listOfPersons.add(person2);
		listOfPersons.add(person3);
		listOfPersons.add(person4);
		personRepo.saveAll(listOfPersons);
		
		System.out.println("All person got inserted successfully...");
		
	}
	public List<Person> getAllPersons(){
		Iterable<Person>  iterable = personRepo.findAll();
		List<Person> allPersons  = StreamSupport
				.stream(iterable.spliterator(), false)
				.collect(Collectors.toList());
		
				return allPersons;
	}
}
