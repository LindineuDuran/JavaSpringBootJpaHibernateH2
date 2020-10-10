package com.lduran.jpaonetoone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Owner")
public class Owner
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	@OneToOne
	@JoinColumn(name = "car_id", referencedColumnName = "id")
	private Car car;

	/**
	 *
	 */
	public Owner()
	{
		super();
	}

	/**
	 * @param name
	 */
	public Owner(String name)
	{
		super();
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setCar(Car car)
	{
		this.car = car;
	}

	public Car getCar()
	{
		return car;
	}

	@Override
	public String toString()
	{
		return "Owner [id=" + id + ", name=" + name + "]";
	}
}
