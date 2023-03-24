package entitie;

public class Piece {
	
	private String type;
	private String playerName;
	
	
	public Piece(String type, String playerName) {
		this.type = type;
		this.playerName = playerName;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
}
