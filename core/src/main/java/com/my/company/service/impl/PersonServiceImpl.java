/**
 * 
 */
package com.my.company.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.company.core.dao.PersonRepository;
import com.my.company.core.domain.Person;
import com.my.company.service.PersonService;

/**
 * @author rarora
 *
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public void save(Person person) {
		personRepository.save(person);
		for(int i = 0; i < 10; i++) {
			personRepository.save(new Person("Richard"));
		}
		//throw new RuntimeException();
	}

	@Override
	public Iterable<Person> findAll() {
		return personRepository.findAll();
	}

}
