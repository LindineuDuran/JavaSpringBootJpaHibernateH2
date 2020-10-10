package com.lduran.jpaonetooneunidirectional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lduran.jpaonetooneunidirectional.model.Address;
import com.lduran.jpaonetooneunidirectional.model.User;
import com.lduran.jpaonetooneunidirectional.repository.AddressRepository;
import com.lduran.jpaonetooneunidirectional.repository.UserRepository;

@SpringBootApplication
public class JpaOneToOneUnidirectionalApplication
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext cac = SpringApplication.run(JpaOneToOneUnidirectionalApplication.class, args);

		AddressRepository addressRepository = cac.getBean(AddressRepository.class);
		UserRepository userRepository = cac.getBean(UserRepository.class);

		Address address = new Address("Home st.");
		addressRepository.save(address);

		User user = new User("John Doe", address);
		userRepository.save(user);
	}

}
