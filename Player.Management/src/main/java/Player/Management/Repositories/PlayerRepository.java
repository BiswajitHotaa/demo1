package Player.Management.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Player.Management.Entities.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
