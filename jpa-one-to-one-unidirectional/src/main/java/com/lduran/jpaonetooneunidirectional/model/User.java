package com.lduran.jpaonetooneunidirectional.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	@OneToOne
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;

	/**
	 * @param name
	 * @param address
	 */
	public User(String name, Address address)
	{
		super();
		this.name = name;
		this.address = address;
	}
}
