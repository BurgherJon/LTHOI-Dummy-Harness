package com.lthoi.test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** This is used to manage the active user. **/
public class Week 
{
	private int number;
	private int season;
	private String short_name;
	private String long_name;
	private Date start;
		
	//This constructor is for testing purposes and just creates week 3 of the 2015 season.
	public Week()
	{		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		this.number = 3;
		this.season = 2015;
		this.short_name = "WK3";
		this.long_name = "Week 3";
		try 
		{
			this.start = sdf.parse("27/09/2015 16:25:00");
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}	
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public void setNumber(int update)
	{
		this.number = update;
	}
	
	public int getSeason()
	{
		return season;
	}
	
	public void setSeason(int update)
	{
		season = update;
	}
	
	public Date getStart()
	{
		return start;
	}
	
	public void setStart(Date update)
	{
		start = update;
	}
	
	public String getShort_Name()
	{
		return short_name;
	}
	
	public void setShort_Name(String update)
	{
		short_name = update;
	}
	
	public String getLong_Name()
	{
		return long_name;
	}
	
	public void setLong_Name(String update)
	{
		long_name = update;
	}
	
}

