package com.lduran.jpaonetooneunidirectional.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lduran.jpaonetooneunidirectional.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long>
{

}
