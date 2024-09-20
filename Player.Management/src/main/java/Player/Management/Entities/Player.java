package Player.Management.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Player 
{
	@Id
	int pId;
	String pName;
	String sports;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int pId, String pName, String sports) {
		this.pId = pId;
		this.pName = pName;
		this.sports = sports;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getSports() {
		return sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	@Override
	public String toString() {
		return "Player [pId=" + pId + ", pName=" + pName + ", sports=" + sports + "]";
	}
}
