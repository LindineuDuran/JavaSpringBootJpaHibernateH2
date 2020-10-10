package com.lduran.jpamanytomany.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lduran.jpamanytomany.model.Viewer;

@Repository
public interface ViewerRepository extends CrudRepository<Viewer, Long>
{

}
