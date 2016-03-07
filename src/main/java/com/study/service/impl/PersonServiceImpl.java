package com.study.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.study.dao.PersonDao;
import com.study.model.PersonDto;
import com.study.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService {
	
	@Resource
	private PersonDao personDao;

	public List<PersonDto> queryPerson() {
		return personDao.queryPerson();
	}

}
