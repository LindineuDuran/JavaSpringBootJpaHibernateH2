package com.lduran.jpaonetomanybidirectional.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Item")
public class Item
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String serialNumber;

	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;

	/**
	 *
	 */
	public Item()
	{
		super();
	}

	/**
	 * @param serialNumber
	 * @param cart
	 */
	public Item(String serialNumber, Cart cart)
	{
		super();
		this.serialNumber = serialNumber;
		this.cart = cart;
	}
}
