package Player.Management.Services;

import java.util.List;

import Player.Management.Entities.Player;

public interface PlayerService 
{
	String addPlayer(Player p);
	String deletePlayer(int pId);
	String updatePlayer(Player p);
	Player fetchPlayer(int pId);
	String deleteAll();
	
	List<Player> fetchAllPlayers();
	
	
	

}
