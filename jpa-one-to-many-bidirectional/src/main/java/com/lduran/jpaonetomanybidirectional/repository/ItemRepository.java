package com.lduran.jpaonetomanybidirectional.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lduran.jpaonetomanybidirectional.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>
{

}
