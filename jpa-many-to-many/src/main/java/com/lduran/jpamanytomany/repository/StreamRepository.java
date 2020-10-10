package com.lduran.jpamanytomany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lduran.jpamanytomany.model.Stream;

@Repository
public interface StreamRepository extends CrudRepository<Stream, Long>
{

}
