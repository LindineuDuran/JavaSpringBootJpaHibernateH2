package com.lduran.jpaonetooneunidirectional.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lduran.jpaonetooneunidirectional.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>
{

}
