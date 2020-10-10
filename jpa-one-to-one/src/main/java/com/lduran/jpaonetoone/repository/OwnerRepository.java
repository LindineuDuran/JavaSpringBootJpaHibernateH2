package com.lduran.jpaonetoone.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lduran.jpaonetoone.model.Owner;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long>
{

}
