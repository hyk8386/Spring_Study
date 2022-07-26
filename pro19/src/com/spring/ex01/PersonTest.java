package com.spring.ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		                     // 스프링컨테이너를 만드는것 
		PersonService person = (PersonService) factory.getBean("personService");
		                       // 강제형변환                      personService 호출
		//PersonService person = new PersonServiceImpl();
		person.sayHello();
		

	}

}
