package com.lduran.jpaonetomanyunidirectional.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String indexNumber;

	/**
	 *
	 */
	public Student()
	{
		super();
	}

	/**
	 * @param indexNumber
	 */
	public Student(String indexNumber)
	{
		super();
		this.indexNumber = indexNumber;
	}

	public String getIndexNumber()
	{
		return indexNumber;
	}
}
