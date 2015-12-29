/**
 * 
 */
package com.my.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.company.core.dao.PersonRepository;
import com.my.company.core.dao.impl.CustomPersonDaoImpl;
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

	@Autowired
	private CustomPersonDaoImpl customPersonDaoImpl;

	@Override
	public void save(Person person) {
		personRepository.save(person);
/*		for(int i = 0; i < 10; i++) {
			personRepository.save(new Person("Richard"));
		}
*/		//throw new RuntimeException();
	}

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}

	@Override
	public void savePerson(Person person) {
		customPersonDaoImpl.savePerson(person);
		//throw new RuntimeException();
	}

}
