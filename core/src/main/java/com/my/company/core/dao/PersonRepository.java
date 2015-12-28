package com.my.company.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.company.core.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
