package com.lthoi.test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** This is used to manage the active user. **/
public class Team
{
	private int id;
	private String name;
	private String city;
		
	//This constructor is for testing purposes and just creates the Steelers.
	public Team()
	{		
		this.id = 1; //Note that the Steelers are not actually ID 1 in previous versions.
		this.name = "Steelers";
		this.city = "Pittsburgh";
	}
	
	public int getID()
	{
		return id;
	}
	
	public void setID(int update)
	{
		this.id = update;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String update)
	{
		this.name = update;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String update)
	{
		city = update;
	}
	
}

