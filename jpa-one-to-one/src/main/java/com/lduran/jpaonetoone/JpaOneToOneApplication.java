package com.lduran.jpaonetoone;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lduran.jpaonetoone.model.Car;
import com.lduran.jpaonetoone.model.Owner;
import com.lduran.jpaonetoone.repository.CarRepository;
import com.lduran.jpaonetoone.repository.OwnerRepository;

@SpringBootApplication
public class JpaOneToOneApplication
{
	private static final Logger log = LoggerFactory.getLogger(JpaOneToOneApplication.class);

	public static void main(String[] args)
	{
		ConfigurableApplicationContext cac = SpringApplication.run(JpaOneToOneApplication.class, args);

		CarRepository carRepository = cac.getBean(CarRepository.class);
		OwnerRepository ownerRepository = cac.getBean(OwnerRepository.class);

		Car car = new Car("Eco Sport");
		carRepository.save(car);

		Owner owner = new Owner("John Doe");
		owner.setCar(car);

		ownerRepository.save(owner);

		Optional<Car> optionalCar = carRepository.findById(1L);
		Optional<Owner> optionalOwner = ownerRepository.findById(2L);

		if (optionalCar.isPresent() && optionalOwner.isPresent())
		{
			log.info(optionalCar.get() + " is owned by " + optionalCar.get().getOwner());
			log.info(optionalOwner.get() + " has a car " + optionalOwner.get().getCar());
		}
	}

}
