package Player.Management.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController 
{
	@GetMapping("/openAddPlayerPage")
	public String openAddPlayerPage()
	{
		return "addPlayer";
	}
	
	@GetMapping("/openDeletePlayerPage")
	public String deletePlayer()
	{
		return "deletePlayer";
	}
	
	@GetMapping("/openFetchPlayerPage")
	public String fetchPlayer()
	{
		return "fetchPlayer";
	}
	
	@GetMapping("/openupdatePlayerPage")
	public String updatePlayer()
	{
		return "updatePlayer";
	}
}
