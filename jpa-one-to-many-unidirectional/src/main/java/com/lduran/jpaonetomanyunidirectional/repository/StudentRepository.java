package com.lduran.jpaonetomanyunidirectional.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lduran.jpaonetomanyunidirectional.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>
{

}
