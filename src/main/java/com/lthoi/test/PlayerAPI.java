package com.lthoi.test;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.CollectionResponse;

import java.util.ArrayList;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(name = "playerAPI",
     version = "v1",
     description = "This API includes all of the methods for players.  A player need only be authenticated as a user to access it.")

public class PlayerAPI 
{
    @ApiMethod(name = "getCurrentWeek")
    public Week getCurrentWeek() 
    {
        Week response = new Week();

        return response;
    }
	
	@ApiMethod(name = "getMe")
    public Me getMe() 
    {
        Me response = new Me();

        return response;
    }
    
    @ApiMethod(name = "getGames")
    public ArrayList<Game> getGames(@Named("league_season_id") int league_season_id, @Named("week") int week)
    {
    	ArrayList<Game> response;
    	response = new ArrayList<Game> ();
    	response.add(new Game(110));
    	response.add(new Game(111));
    	response.add(new Game(99));
    	response.add(new Game(100));
    	response.add(new Game(101));
    	response.add(new Game(102));
    	response.add(new Game(103));
    	response.add(new Game(104));
    	response.add(new Game(105));
    	response.add(new Game(106));
    	response.add(new Game(107));
    	response.add(new Game(108));
    	response.add(new Game(109));
    	response.add(new Game(112));
    	response.add(new Game(114));
    	response.add(new Game(113));
    	
    	
    	return response;
    }
    
    @ApiMethod(name = "getActiveLeagueSeasons")
    public ArrayList<League_Season> getActiveLeagueSeasons()
    {
    	ArrayList<League_Season> response;
    	response = new ArrayList<League_Season> ();
    	response.add(new League_Season());
    	
    	
    	return response;
    }
    
    
    @ApiMethod(name = "setMe")
    public Me setMe(@Named("email") String email, @Named("fname") String fname, @Named("linitial") String linitial, @Named("lname") String lname) 
    {
    	Me response = new Me();
    	
    	return response;
    }
    
    @ApiMethod(name = "getBets")
    public ArrayList<Bet> getBets(@Named("house_bets") int house_bets, @Named("this_week") int this_week, @Nullable @Named("league_season_id") int league_season_id) 
    {
    	ArrayList<Bet> response;
    	response = new ArrayList<Bet> ();
    	response.add(new Bet(198));
    	response.add(new Bet(199));
    	response.add(new Bet(200));
    	
    	if(house_bets == 1)
    	{
    		response.add(new Bet(191));
        	response.add(new Bet(193));
        	response.add(new Bet(205));
        	response.add(new Bet(194));
        	response.add(new Bet(183));
        	response.add(new Bet(196));
        	response.add(new Bet(190));
        	response.add(new Bet(197));
        	response.add(new Bet(194));
        	response.add(new Bet(204));
        	response.add(new Bet(203));
        	response.add(new Bet(195));
    	}
    	
    	return response;
    }
    @ApiMethod(name = "setBet")
    public Bet setBet(@Named("home_team") String home_team, @Named("league_season_id") int league_season_id, @Nullable @Named("id") int id) 
    {
    	return new Bet(999);
    }
    
    @ApiMethod(name = "deleteBet")
    public void deleteBet (@Named("id") int id)
    {
    	
    }
    
    @ApiMethod(name = "getTeam")
    public Team getTeam (@Named("id") int id, @Nullable @Named("city") String city, @Nullable @Named("team") String team)
    {
    	Team result = new Team();
    	return result;
    }
    
    @ApiMethod(name = "getUser")
    public User getUser (@Named("email") String email, @Named("league_season") int league_season_id)
    {
    	if (email.equals("soldan.bojan@gmail.com"))
    	{
    		return new User("Bojan");
    	}
    	else if (email.equals("Clayton@cavellandcavell.com"))
    	{
    		return new User("Clayton");
    	}
    	else if (email.equals("Bruce.Schmerling@gmail.com"))
    	{
    		return new User("Bruce");
    	}
    	else if (email.equals("ryan.contestabile@gmail.com"))
    	{
    		return new User("Ryan");
    	}
    	else if (email.equals("derek.satterfield@gmail.com"))
    	{
    		return new User("Derek");
    	}
    	else if (email.equals("aaronsmarcus@gmail.com"))
    	{
    		return new User("Aaron");
    	}
    	else if (email.equals("Bradley.J.Fraser@gmail.com"))
    	{
    		return new User("Brad");
    	}
    	else 
    	{
    		return new User("Jonathan");
    	}
    }
    
    @ApiMethod(name = "getUsers")
    public ArrayList<User> getUsers (@Named("league_season") int league_season_id)
    {
    	
    	ArrayList<User> response;
    	response = new ArrayList<User> ();
    	response.add(new User("Bojan"));
    	response.add(new User("Clayton"));
    	response.add(new User("Bruce"));
    	response.add(new User("Ryan"));
    	response.add(new User("Derek"));
    	response.add(new User("Aaron"));
    	response.add(new User("Brad"));
    	response.add(new User("Jonathan"));
    	
    	return response;
    }

}

