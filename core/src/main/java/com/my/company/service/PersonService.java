package com.my.company.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.my.company.core.domain.Person;

@Transactional(readOnly=true)
public interface PersonService {
	
	@Transactional(readOnly=false)
	public void save(Person person);
	
	public List<Person> findAll();
	
	@Transactional(readOnly=false)
	public void savePerson(Person person);
}
