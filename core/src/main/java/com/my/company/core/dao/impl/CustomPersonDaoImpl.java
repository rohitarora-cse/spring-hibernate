package com.my.company.core.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.company.core.domain.Person;

@Repository
public class CustomPersonDaoImpl {

	//@Autowired
	//private EntityManagerFactory entityManagerFactory;
	@Autowired
	private SessionFactory sessionFactory;
	
	public void savePerson(Person person) {
		//entityManagerFactory.
		sessionFactory.getCurrentSession().save(person);
	}
}
