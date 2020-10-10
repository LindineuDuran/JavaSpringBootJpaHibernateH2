package com.lduran.jpaonetomanybidirectional.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cart")
public class Cart
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Item> itens = new ArrayList<>();

	/**
	 *
	 */
	public Cart()
	{
		super();
	}

	/**
	 * @param name
	 */
	public Cart(String name)
	{
		super();
		this.name = name;
	}

	public void setItens(List<Item> itens)
	{
		this.itens = itens;
	}
}
