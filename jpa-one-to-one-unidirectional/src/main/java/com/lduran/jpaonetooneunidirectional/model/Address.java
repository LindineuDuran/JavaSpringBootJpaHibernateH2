package com.lduran.jpaonetooneunidirectional.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String street;

	/**
	 * @param street
	 */
	public Address(String street)
	{
		super();
		this.street = street;
	}

}