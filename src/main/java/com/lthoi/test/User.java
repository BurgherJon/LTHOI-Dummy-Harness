package com.lthoi.test;

/** This is used to manage the active user. **/
public class User 
{
	private int league_season_id;
	private String email;
	private String fname;
	private String linitial;
	private int wins;
	private int losses;
	private int pushes;
	private double winnings;
		
	//This constructor is for testing purposes and just creates the user with the agreed to test data (see TestHarnessScenario.doc)
	public User(String thefname)
	{		
		if (thefname.equals("Bojan"))
		{
			this.league_season_id = 1;
			this.email = "soldan.bojan@gmail.com";
			this.fname = "Bojan";
			this.linitial = "S";
			this.wins = 4;
			this.losses = 3;
			this.pushes = 1;
			this.winnings = 28.57;
		}
		else if (thefname.equals("Clayton"))
		{
			this.league_season_id = 1;
			this.email = "Clayton@cavellandcavell.com";
			this.fname = "Clayton";
			this.linitial = "C";
			this.wins = 1;
			this.losses = 4;
			this.pushes = 1;
			this.winnings = -62.86;
		}
		else if (thefname.equals("Bruce"))
		{
			this.league_season_id = 1;
			this.email = "Bruce.Schmerling@gmail.com";
			this.fname = "Bruce";
			this.linitial = "S";
			this.wins = 3;
			this.losses = 3;
			this.pushes = 1;
			this.winnings = 5.71;
		}
		else if (thefname.equals("Ryan"))
		{
			this.league_season_id = 1;
			this.email = "ryan.contestabile@gmail.com";
			this.fname = "Ryan";
			this.linitial = "C";
			this.wins = 0;
			this.losses = 2;
			this.pushes = 1;
			this.winnings = -48.57;
		}
		else if (thefname.equals("Derek"))
		{
			this.league_season_id = 1;
			this.email = "derek.satterfield@gmail.com";
			this.fname = "Derek";
			this.linitial = "S";
			this.wins = 3;
			this.losses = 3;
			this.pushes = 0;
			this.winnings = 5.71;
		}
		else if (thefname.equals("Aaron"))
		{
			this.league_season_id = 1;
			this.email = "aaronsmarcus@gmail.com";
			this.fname = "Aaron";
			this.linitial = "S";
			this.wins = 3;
			this.losses = 5;
			this.pushes = 0;
			this.winnings = -40;
		}
		else if (thefname.equals("Brad"))
		{
			this.league_season_id = 1;
			this.email = "Bradley.J.Fraser@gmail.com";
			this.fname = "Brad";
			this.linitial = "F";
			this.wins = 4;
			this.losses = 3;
			this.pushes = 0;
			this.winnings = 28.57;
		}
		else if (thefname.equals("Jonathan"))
		{
			this.league_season_id = 1;
			this.email = "JonathanCavell@gmail.com";
			this.fname = "Jonathan";
			this.linitial = "C";
			this.wins = 5;
			this.losses = 2;
			this.pushes = 0;
			this.winnings = 74.29;
		}
		
	}
	
	public int getLeague_season_id()
	{
		return league_season_id;
	}
	
	public void setLeague_season_id(int update)
	{
		this.league_season_id = update;
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
		this.winnings = update;
	}
}

