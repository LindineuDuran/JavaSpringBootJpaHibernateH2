package com.lduran.jpaonetoone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lduran.jpaonetoone.model.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long>
{

}
