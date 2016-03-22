package com.lthoi.test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** This is used to manage the active user. **/
public class Bet
{
	private int id;
	private String email;
	private String picked_team;
	private String picked_city;
	private String against_team;
	private String against_city;
	private int week_number;
	private String week_short;
	private String week_long;
	private int league_season_id;
	private double line;
	private int isHouseBet;
	private String result;
	private Date start;
		
	//This constructor is for testing purposes and just creates week 3 of the 2015 season.
	public Bet(int theid)
	{		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		id = theid;
		
		if (this.id == 198)
		{
			this.email = "soldan.bojan@gmail.com";
			this.against_team = "Seahawks";
			this.against_city = "Seattle";
			this.picked_team = "Bears";
			this.picked_city = "Chicago";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = 14;
			this.isHouseBet = 0;
			this.result = "Good Luck";
			try 
			{
				this.start = sdf.parse("27/09/2015 16:25:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		else if (this.id == 199)
		{
			this.email = "soldan.bojan@gmail.com";
			this.picked_team = "Redskins";
			this.picked_city = "Washington";
			this.against_team = "Giants";
			this.against_city = "New York";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = 6;
			this.isHouseBet = 0;
			this.result = "Lost";
			try 
			{
				this.start = sdf.parse("24/09/2015 20:25:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		else if (this.id == 191)
		{
			this.email = "Bradley.J.Fraser@gmail.com";
			this.picked_team = "Rams";
			this.picked_city = "St. Louis";
			this.against_team = "Steelers";
			this.against_city = "Pittsburgh";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = 1;
			this.isHouseBet = 1;
			this.result = "Lost";
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		else if (this.id == 193)
		{
			this.email = "Bruce.Schmerling@gmail.com";
			this.picked_team = "Steelers";
			this.picked_city = "Pittsburgh";
			this.against_team = "Rams";
			this.against_city = "St. Louis";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = -1;
			this.isHouseBet = 1;
			this.result = "Won";
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		else if (this.id == 205)
		{
			this.email = "JonathanCavell@gmail.com";
			this.picked_team = "Steelers";
			this.picked_city = "Pittsburgh";
			this.against_team = "Rams";
			this.against_city = "St. Louis";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = -1;
			this.isHouseBet = 1;
			this.result = "Won";
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		else if (this.id == 200)
		{
			this.email = "soldan.bojan@gmail.com";
			this.picked_team = "Steelers";
			this.picked_city = "Pittsburgh";
			this.against_team = "Rams";
			this.against_city = "St. Louis";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = -1;
			this.isHouseBet = 0;
			this.result = "Won";
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		else if (this.id == 194)
		{
			this.email = "Bruce.Schmerling@gmail.com";
			this.picked_team = "Eagles";
			this.picked_city = "Philadelphia";
			this.against_team = "Jets";
			this.against_city = "New York";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = 1.5;
			this.isHouseBet = 1;
			this.result = "Won";
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		else if (this.id == 183)
		{
			this.email = "aaronsmarcus@gmail.com";
			this.picked_team = "Ravens";
			this.picked_city = "Baltimore";
			this.against_team = "Bengals";
			this.against_city = "Cincinnati";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = -2.5;
			this.isHouseBet = 1;
			this.result = "Lost";
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		else if (this.id == 196)
		{
			this.email = "aaronsmarcus@gmail.com";
			this.picked_team = "Falcons";
			this.picked_city = "Atlanta";
			this.against_team = "Cowboys";
			this.against_city = "Dallas";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = -1;
			this.isHouseBet = 1;
			this.result = "Won";
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		else if (this.id == 190)
		{
			this.email = "Bradley.J.Fraser@gmail.com";
			this.picked_team = "Cardinals";
			this.picked_city = "Arizona";
			this.against_team = "49ers";
			this.against_city = "San Francisco";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = -6.5;
			this.isHouseBet = 1;
			this.result = "Good Luck";
			try 
			{
				this.start = sdf.parse("27/09/2015 16:05:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		else if (this.id == 197)
		{
			this.email = "aaronsmarcus@gmail.com";
			this.picked_team = "Seahawks";
			this.picked_city = "Seattle";
			this.against_team = "Bears";
			this.against_city = "Chicago";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = -14;
			this.isHouseBet = 1;
			this.result = "Good Luck";
			try 
			{
				this.start = sdf.parse("27/09/2015 16:05:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		else if (this.id == 192)
		{
			this.email = "Bradley.J.Fraser@gmail.com";
			this.picked_team = "Lions";
			this.picked_city = "Detroit";
			this.against_team = "Broncos";
			this.against_city = "Denver";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = 3;
			this.isHouseBet = 1;
			this.result = "Good Luck";
			try 
			{
				this.start = sdf.parse("27/09/2015 20:30:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		else if (this.id == 204)
		{
			this.email = "JonathanCavell@gmail.com";
			this.picked_team = "Broncos";
			this.picked_city = "Denver";
			this.against_team = "Lions";
			this.against_city = "Detroit";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = -3;
			this.isHouseBet = 1;
			this.result = "Good Luck";
			try 
			{
				this.start = sdf.parse("27/09/2015 20:30:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		else if (this.id == 203)
		{
			this.email = "JonathanCavell@gmail.com";
			this.picked_team = "Packers";
			this.picked_city = "Green Bay";
			this.against_team = "Chiefs";
			this.against_city = "Kansas City";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = -7;
			this.isHouseBet = 1;
			this.result = "Good Luck";
			try 
			{
				this.start = sdf.parse("28/09/2015 20:30:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		
		else if (this.id == 195)
		{
			this.email = "Bruce.Schmerling@gmail.com";
			this.picked_team = "Packers";
			this.picked_city = "Green Bay";
			this.against_team = "Chiefs";
			this.against_city = "Kansas City";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = -7;
			this.isHouseBet = 1;
			this.result = "Good Luck";
			try 
			{
				this.start = sdf.parse("28/09/2015 20:30:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		
		else if (this.id == 399)
		{
			this.email = "Soldan.Bojan@gmail.com";
			this.picked_team = "Packers";
			this.picked_city = "Green Bay";
			this.against_team = "Chiefs";
			this.against_city = "Kansas City";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = -7;
			this.isHouseBet = 0;
			this.result = "Good Luck";
			try 
			{
				this.start = sdf.parse("28/09/2015 20:30:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		
		else if (this.id == 999)
		{
			this.email = "Soldan.Bojan@gmail.com";
			this.picked_team = "Lions";
			this.picked_city = "Detroit";
			this.against_team = "Broncos";
			this.against_city = "Denver";
			this.week_number = 3;
			this.league_season_id = 1;
			this.line = 3;
			this.isHouseBet = 1;
			this.result = "Good Luck";
			try 
			{
				this.start = sdf.parse("27/09/2015 20:30:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			} 
		}
		
		
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int update)
	{
		this.id = update;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String update)
	{
		email = update;
	}
	
	public Date getStart()
	{
		return start;
	}
	
	public void setStart(Date update)
	{
		start = update;
	}
	
	public String getPicked_City()
	{
		return picked_city;
	}
	
	public void setPicked_City(String update)
	{
		picked_city = update;
	}
	
	public String getAgainst_Team()
	{
		return against_team;
	}
	
	public void setAgainst_Team(String update)
	{
		against_team = update;
	}
	
	public String getWeek_Short()
	{
		return week_short;
	}
	
	public void setWeek_Short(String update)
	{
		week_short = update;
	}
	
	public String getWeek_Long()
	{
		return week_long;
	}
	
	public void setWeek_Long(String update)
	{
		week_long = update;
	}
	
	public double getLine()
	{
		return line;
	}
	
	public void setLine(double update)
	{
		line = update;
	}
	
	public int getIsHouseBet()
	{
		return isHouseBet;
	}
	
	public void setIsHouseBet(int update)
	{
		isHouseBet = update;
	}
	
	public int getLeague_Season_ID()
	{
		return this.league_season_id;
	}
	
	public void setLeague_Season_ID(int update)
	{
		this.league_season_id = update;
	}
	
	public String getResult()
	{
		return result;
	}
	
	public void setResult(String update)
	{
		result = update;
	}	
	
	public String getPicked_Team()
	{
		return picked_team;
	}
	
	public void setPicked_Team(String update)
	{
		picked_team = update;
	}
	
	public String getAgainst_City()
	{
		return against_city;
	}
	
	public void setAgainst_City(String update)
	{
		against_city = update;
	}
	
	public int getWeek_Number()
	{
		return week_number;
	}
	
	public void setWeek_Number(int update)
	{
		week_number = update;
	}
	
	
}

