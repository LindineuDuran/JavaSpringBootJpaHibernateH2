package com.lduran.jpaonetomanyunidirectional.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "University")
public class University
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "university_id")
	private List<Student> students = new ArrayList<>();

	/**
	 *
	 */
	public University()
	{
		super();
	}

	/**
	 * @param name
	 * @param students
	 */
	public University(String name, List<Student> students)
	{
		super();
		this.name = name;
		this.students = students;
	}

	public String getName()
	{
		return name;
	}

	public List<Student> getStudents()
	{
		return students;
	}
}
