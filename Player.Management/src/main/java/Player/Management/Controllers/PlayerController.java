package Player.Management.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Player.Management.Entities.Player;
import Player.Management.Services.PlayerService;

@RestController
public class PlayerController 
{
	@Autowired
	PlayerService service;
	
	@PostMapping("/addPlayer")
	public String addPlayer(@ModelAttribute Player p)
	{
		service.addPlayer(p);
		return "Player added Successfully";
	}
	
	@GetMapping("/deletePlayer")
	public String deletePlayer(@RequestParam int pId)
	{
		service.deletePlayer(pId);
		return "Player deleted Successfully";
	}
	
	@GetMapping("/fetchPlayer")
	public Player fetchPlayer(@RequestParam int pId)
	{
		return service.fetchPlayer(pId);
	}
	
	@PostMapping("/updatePlayer")
	public String updatePlayer(@ModelAttribute Player p)
	{
		service.addPlayer(p);
		return "Player Updated Successfully";
	}
	
	@GetMapping("/fetchAll")
	public List<Player> fetchAllPlayers()
	{
		return service.fetchAllPlayers();
	}
	
	@GetMapping("/deleteAll")
	public String deleteAllPlayers()
	{
		service.deleteAll();
		return "All Players deleted";
	}
}
