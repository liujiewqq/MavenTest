package com.study;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.dao.PersonDao;
import com.study.model.PersonDto;
import com.study.service.PersonService;
import com.study2.SpringTest;


@ContextConfiguration(locations = { "classpath*:META-INF/application-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSpringMysql {
//	@Resource(name="springMysqlDemo")
//	private SpringMysqlDemo springMysqlDemo;
	
	@Resource
	private PersonService personService;
	
	@Resource(name="springTest")
	private SpringTest springTest;
	@Test
	public void test(){
		//springMysqlDemo.say();
		springTest.say();
		System.out.println("123");
		
		List<PersonDto> personDtoList=personService.queryPerson();
		System.out.println("++++++++++++++++++++++++++++++++"+personDtoList);
	}

}
