package com.lthoi.test;

/** This is used to manage the active user. **/
public class Me 
{
	private int id;
	private String email;
	private String fname;
	private String lname;
	private String linitial;
	private int wins;
	private int losses;
	private int pushes;
	private double winnings;
		
	//This constructor is for testing purposes and just creates the user with the agreed to test data (see TestHarnessScenario.doc)
	public Me()
	{		
		this.id = 1;
		this.email = "soldan.bojan@gmail.com";
		this.fname = "Bojan";
		this.lname = "Soldan";
		this.linitial = "S";
		this.wins = 4;
		this.losses = 3;
		this.pushes = 1;
		this.winnings = 28.57;
	}
	
	public int getID()
	{
		return id;
	}
	
	public void setID(int update)
	{
		id = update;
	}
	
	public int getPushes()
	{
		return pushes;
	}
	
	public void setPushes(int update)
	{
		pushes = update;
	}
	
	public int getLosses()
	{
		return losses;
	}
	
	public void setLosses(int update)
	{
		losses = update;
	}
	
	public int getWins()
	{
		return wins;
	}
	
	public void setWins(int update)
	{
		wins = update;
	}
	
	public String getLinitial()
	{
		return linitial;
	}
	
	public void setLinitial(String update)
	{
		linitial = update;
	}
	
	public String getLname()
	{
		return lname;
	}
	
	public void setLname(String update)
	{
		lname = update;
	}
	
	public String getFname()
	{
		return fname;
	}
	
	public void setFname(String update)
	{
		fname = update;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String update)
	{
		email = update;
	}
	
	public double getWinnings()
	{
		return winnings;
	}
	
	public void setWinnings(double update)
	{
		winnings = update;
	}
}

