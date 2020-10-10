package com.lduran.jpaonetomanyunidirectional.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lduran.jpaonetomanyunidirectional.model.University;

@Repository
public interface UniversityRepository extends CrudRepository<University, Long>
{

}
