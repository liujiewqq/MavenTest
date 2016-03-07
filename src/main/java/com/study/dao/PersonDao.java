package com.study.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.study.model.PersonDto;

@Repository
public interface PersonDao {
	
	public List<PersonDto> queryPerson();

}
