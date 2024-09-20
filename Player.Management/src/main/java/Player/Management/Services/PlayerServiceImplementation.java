package Player.Management.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Player.Management.Entities.Player;
import Player.Management.Repositories.PlayerRepository;

@Service
public class PlayerServiceImplementation implements PlayerService
{
	@Autowired
	PlayerRepository repo;

	public String addPlayer(Player p) 
	{
		repo.save(p);
		return "Player added";
	}

	public String deletePlayer(int pId)
	{
		repo.deleteById(pId);
		return "Player deleted";
	}
	
	public String updatePlayer(Player p)
	{
		repo.save(p);
		return "Player Updated";
	}

	public Player fetchPlayer(int pId) 
	{
		return repo.findById(pId).get();
	}
	
	

	public List<Player> fetchAllPlayers()
	{
		return repo.findAll();
	}

	public String deleteAll() {
		repo.deleteAll();
		return "All Players are deleted";
	}
	
	

}
