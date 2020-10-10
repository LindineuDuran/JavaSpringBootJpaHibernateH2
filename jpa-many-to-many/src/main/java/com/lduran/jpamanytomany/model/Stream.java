package com.lduran.jpamanytomany.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Stream")
public class Stream
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;

	@ManyToMany(mappedBy = "followedStreams")
	private List<Viewer> followers = new ArrayList<>();

	/**
	 * @param name
	 */
	public Stream(String name)
	{
		super();
		this.name = name;
	}

	public void addViewer(Viewer viewer)
	{
		followers.add(viewer);
	}
}
