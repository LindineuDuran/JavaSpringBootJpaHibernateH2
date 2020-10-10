package com.lduran.jpaonetoone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Car")
public class Car
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String model;

	@OneToOne(mappedBy = "car")
	private Owner owner;

	/**
	 *
	 */
	public Car()
	{
		super();
	}

	/**
	 * @param model
	 */
	public Car(String model)
	{
		super();
		this.model = model;
	}

	public String getModel()
	{
		return model;
	}

	public Owner getOwner()
	{
		return owner;
	}

	@Override
	public String toString()
	{
		return "Car [id=" + id + ", model=" + model + "]";
	}
}
