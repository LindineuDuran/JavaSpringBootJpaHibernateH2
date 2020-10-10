package com.lduran.jpaonetomanybidirectional.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lduran.jpaonetomanybidirectional.model.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long>
{

}
