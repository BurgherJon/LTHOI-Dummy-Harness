package com.lthoi.test;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/** This is used to manage the active user. **/
public class Game 
{
	private int id;
	private String home_team;
	private String home_city;
	private String away_team;
	private String away_city;
	private double home_line;
	private Date start;
	private Date freeze;
	private String week;
	private int isFinished;
	private int home_score;
	private int away_score;
	private ArrayList<User> home_bets;
	private ArrayList<User> away_bets;
	
	private int mins_remaining;
	private int secs_remaining;
	private double user_net_home_bet;
		
	public Game()
	{
		
	}
	
	
	//This constructor is for testing purposes it can be used to create all of the games for the test scenario as of the time in the test document (see TestHarnessScenario.doc)
	public Game(int theid)
	{		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		this.id = theid;
		
		if (this.id == 110)
		{ 	
			this.home_team = "Seahawks";
			this.home_city = "Seattle";
			this.away_city = "Chicago";
			this.away_team = "Bears";
			this.home_line = -14;
			try 
			{
				this.start = sdf.parse("27/09/2015 16:25:00");
				this.freeze = sdf.parse("27/09/2015 15:25:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 6;
			this.away_score = 0;
			this.home_bets = new ArrayList<User> ();
			this.home_bets.add(new User("Aaron"));
			this.away_bets = new ArrayList<User> ();
			this.away_bets.add(new User("Bojan"));
			this.mins_remaining = 30;
			this.secs_remaining = 00;
			this.user_net_home_bet = -22.86;
			this.isFinished = 0;
		}
		else if (this.id == 111)
		{	
			this.home_team = "Giants";
			this.home_city = "New York";
			this.away_city = "Washington";
			this.away_team = "Redskins";
			this.home_line = -3;
			try 
			{
				this.start = sdf.parse("24/09/2015 20:25:00");
				this.freeze = sdf.parse("24/09/2015 19:25:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 32;
			this.away_score = 21;
			this.home_bets = new ArrayList<User> ();
			this.away_bets = new ArrayList<User> ();
			this.away_bets.add(new User ("Bojan"));
			this.mins_remaining = 00;
			this.secs_remaining = 00;
			this.user_net_home_bet = -20;
			this.isFinished = 1;
		}
		else if (this.id == 99)  
		{	
			this.home_team = "Rams";
			this.home_city = "St. Louis";
			this.away_city = "Pittsburgh";
			this.away_team = "Steelers";
			this.home_line = 1; 
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
				this.freeze = sdf.parse("27/09/2015 12:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 6;
			this.away_score = 12;
			this.home_bets = new ArrayList<User> ();
			this.home_bets.add(new User("Brad"));
			this.away_bets = new ArrayList<User> ();
			this.away_bets.add(new User("Bruce"));
			this.away_bets.add(new User("Jonathan"));
			this.away_bets.add(new User("Bojan"));
			this.mins_remaining = 00;
			this.secs_remaining = 00;
			this.isFinished = 1;
			this.user_net_home_bet = -17.14;
		}
		else if (this.id == 100)  //Had to guess on this because there weren't any bets on the game.  
		{	
			this.home_team = "Vikings";
			this.home_city = "Minnesota";
			this.away_city = "San Diego";
			this.away_team = "Chargers";
			this.home_line = -2; 
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
				this.freeze = sdf.parse("27/09/2015 12:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 31;
			this.away_score = 14;
			this.home_bets = new ArrayList<User> ();
			this.away_bets = new ArrayList<User> ();
			this.mins_remaining = 00;
			this.secs_remaining = 00;
			this.isFinished = 1;
			this.user_net_home_bet = 0;
		}
		else if (this.id == 101)  //Had to guess on this because there weren't any bets on the game.  
		{	
			this.home_team = "Texans";
			this.home_city = "Houston";
			this.away_city = "Tampa Bay";
			this.away_team = "Buccaneers";
			this.home_line = -6; 
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
				this.freeze = sdf.parse("27/09/2015 12:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 19;
			this.away_score = 9;
			this.home_bets = new ArrayList<User> ();
			this.away_bets = new ArrayList<User> ();
			this.mins_remaining = 00;
			this.secs_remaining = 00;
			this.isFinished = 1;
			this.user_net_home_bet = 0;
		}
		else if (this.id == 102)  
		{	
			this.home_team = "Jets";
			this.home_city = "New York";
			this.away_city = "Philadelphia";
			this.away_team = "Eagles";
			this.home_line = -1.5; 
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
				this.freeze = sdf.parse("27/09/2015 12:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 17;
			this.away_score = 24;
			this.home_bets = new ArrayList<User> ();
			this.away_bets = new ArrayList<User> ();
			this.away_bets.add(new User("Bruce"));
			this.mins_remaining = 00;
			this.secs_remaining = 00;
			this.isFinished = 1;
			this.user_net_home_bet = 2.86;
		}
		else if (this.id == 103)  
		{	
			this.home_team = "Panthers";
			this.home_city = "Carolina";
			this.away_city = "New Orleans";
			this.away_team = "Saints";
			this.home_line = -9.5; 
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
				this.freeze = sdf.parse("27/09/2015 12:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 27;
			this.away_score = 22;
			this.home_bets = new ArrayList<User> ();
			this.away_bets = new ArrayList<User> ();
			this.mins_remaining = 00;
			this.secs_remaining = 00;
			this.isFinished = 1;
			this.user_net_home_bet = 0;
		}
		else if (this.id == 104)  
		{	
			this.home_team = "Patriots";
			this.home_city = "New England";
			this.away_city = "Jacksonville";
			this.away_team = "Jaguars";
			this.isFinished = 1;
			this.home_line = -14; 
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
				this.freeze = sdf.parse("27/09/2015 12:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 51;
			this.away_score = 17;
			this.home_bets = new ArrayList<User> ();
			this.away_bets = new ArrayList<User> ();
			this.mins_remaining = 00;
			this.secs_remaining = 00;
			this.user_net_home_bet = 0;
		}
		else if (this.id == 105)  
		{	
			this.home_team = "Ravens";
			this.home_city = "Baltimore";
			this.away_city = "Cincinnati";
			this.away_team = "Bengals";
			this.home_line = -1.5; 
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
				this.freeze = sdf.parse("27/09/2015 12:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 24;
			this.away_score = 28;
			this.home_bets = new ArrayList<User> ();
			this.home_bets.add(new User("Aaron"));
			this.away_bets = new ArrayList<User> ();
			this.mins_remaining = 00;
			this.secs_remaining = 00;
			this.isFinished = 1;
			this.user_net_home_bet = -2.86;
		}
		else if (this.id == 106)  
		{	
			this.home_team = "Browns";
			this.home_city = "Cleveland";
			this.away_city = "Oakland";
			this.away_team = "Raiders";
			this.home_line = -3.5; 
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
				this.freeze = sdf.parse("27/09/2015 12:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 20;
			this.away_score = 27;
			this.home_bets = new ArrayList<User> ();
			this.away_bets = new ArrayList<User> ();
			this.mins_remaining = 00;
			this.secs_remaining = 00;
			this.isFinished = 1;
			this.user_net_home_bet = 0;
		}
		else if (this.id == 107)  
		{	
			this.home_team = "Titans";
			this.home_city = "Tennessee";
			this.away_city = "Indianapolis";
			this.away_team = "Colts";
			this.home_line = 3.5; 
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
				this.freeze = sdf.parse("27/09/2015 12:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 33;
			this.away_score = 35;
			this.home_bets = new ArrayList<User> ();
			this.away_bets = new ArrayList<User> ();
			this.mins_remaining = 00;
			this.secs_remaining = 00;
			this.isFinished = 1;
			this.user_net_home_bet = 0;
		}
		else if (this.id == 108)  
		{	
			this.home_team = "Cowboys";
			this.home_city = "Dallas";
			this.away_city = "Atlanta";
			this.away_team = "Falcons";
			this.home_line = 0; 
			try 
			{
				this.start = sdf.parse("27/09/2015 13:00:00");
				this.freeze = sdf.parse("27/09/2015 12:00:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 28;
			this.away_score = 39;
			this.home_bets = new ArrayList<User> ();
			this.away_bets = new ArrayList<User> ();
			this.away_bets.add(new User("Aaron"));
			this.mins_remaining = 00;
			this.secs_remaining = 00;
			this.isFinished = 1;
			this.user_net_home_bet = 2.86;
		}
		else if (this.id == 109)  
		{	
			this.home_team = "Cardinals";
			this.home_city = "Arizona";
			this.away_city = "San Francisco";
			this.away_team = "49ers";
			this.home_line = -6.5; 
			try 
			{
				this.start = sdf.parse("27/09/2015 16:05:00");
				this.freeze = sdf.parse("27/09/2015 15:05:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 31;
			this.away_score = 7;
			this.home_bets = new ArrayList<User> ();
			this.home_bets.add(new User("Brad"));
			this.away_bets = new ArrayList<User> ();
			this.mins_remaining = 30;
			this.secs_remaining = 00;
			this.isFinished = 0;
			this.user_net_home_bet = -2.86;
		}
		else if (this.id == 112)  
		{	
			this.home_team = "Lions";
			this.home_city = "Detroit";
			this.away_city = "Denver";
			this.away_team = "Broncos";
			this.home_line = 3; 
			try 
			{
				this.start = sdf.parse("27/09/2015 20:30:00");
				this.freeze = sdf.parse("27/09/2015 19:30:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 6;
			this.away_score = 14;
			this.home_bets = new ArrayList<User> ();
			this.home_bets.add(new User("Brad"));
			this.away_bets = new ArrayList<User> ();
			this.away_bets.add(new User("Jonathan"));
			this.mins_remaining = 60;
			this.secs_remaining = 00;
			this.isFinished = 0;
			this.user_net_home_bet = 0;
		}
		else if (this.id == 114)  //Had to guess on this because there weren't any bets on the game.  
		{	
			this.home_team = "Dolphins";
			this.home_city = "Miami";
			this.away_city = "Buffalo";
			this.away_team = "Bills";
			this.home_line = -1; 
			try 
			{
				this.start = sdf.parse("27/09/2015 16:25:00");
				this.freeze = sdf.parse("27/09/2015 15:25:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 0;
			this.away_score = 27;
			this.home_bets = new ArrayList<User> ();
			this.away_bets = new ArrayList<User> ();
			this.mins_remaining = 30;
			this.secs_remaining = 00;
			this.isFinished = 0;
			this.user_net_home_bet = 0;
		}
		else if (this.id == 113)  
		{	
			this.home_team = "Packers";
			this.home_city = "Green Bay";
			this.away_city = "Kansas City";
			this.away_team = "Chiefs";
			this.home_line = -7; 
			try 
			{
				this.start = sdf.parse("28/09/2015 20:30:00");
				this.freeze = sdf.parse("28/09/2015 19:30:00");
			} 
			catch (ParseException e) 
			{
				e.printStackTrace();
			}
		
			this.week = "WK3";
			this.home_score = 6;
			this.away_score = 14;
			this.home_bets = new ArrayList<User> ();
			this.home_bets.add(new User("Bruce"));
			this.home_bets.add(new User("Jonathan"));
			this.away_bets = new ArrayList<User> ();
			this.mins_remaining = 60;
			this.secs_remaining = 00;
			this.isFinished = 0;
			this.user_net_home_bet = -5.72;
		}
	}
	
	public int getID()
	{
		return id;
	}
	
	public void setID(int update)
	{
		id = update;
	}
	
	public String gethome_team()
	{
		return home_team;
	}
	
	public void sethome_team(String update)
	{
		home_team = update;
	}
	
	public String gethome_city()
	{
		return home_city;
	}
	
	public void sethome_city(String update)
	{
		home_team = update;
	}
	
	public String getaway_team()
	{
		return away_team;
	}
	
	public void setaway_team(String update)
	{
		away_team = update;
	}
	
	public String getaway_city()
	{
		return away_city;
	}
	
	public void setaway_city(String update)
	{
		away_team = update;
	}
	
	public double gethome_line()
	{
		return home_line;
	}
	
	public void sethome_line(double update)
	{
		home_line = update;
	}
	
	public Date getstart ()
	{
		return start;
	}
	
	public void setstart(Date update)
	{
		start = update;
	}
	
	public Date getfreeze ()
	{
		return freeze;
	}
	
	public void setfreeze(Date update)
	{
		freeze = update;
	}
	
	public int gethome_score()
	{
		return home_score;
	}
	
	public void sethome_score(int update)
	{
		home_score = update;
	}
	
	public int getaway_score()
	{
		return away_score;
	}
	
	public void setaway_score(int update)
	{
		away_score = update;
	}
	
	public ArrayList<User> gethome_bets()
	{
		return home_bets;
	}
	
	public void sethome_bets(ArrayList<User> update)
	{
		home_bets = update;
	}
	
	public ArrayList<User> getaway_bets()
	{
		return away_bets;
	}
	
	public void setaway_bets(ArrayList<User> update)
	{
		away_bets = update;
	}
	
	public int getmins_remaining()
	{
		return mins_remaining;
	}
	
	public void setmins_remaining(int update)
	{
		mins_remaining = update;
	}
	
	public int getsecs_remaining()
	{
		return secs_remaining;
	}
	
	public void setsecs_remaining(int update)
	{
		secs_remaining = update;
	}
	
	public double getuser_net_home_bet()
	{
		return user_net_home_bet;
	}
	
	public void setuser_net_home_bet(double update)
	{
		user_net_home_bet = update;
	}
}
