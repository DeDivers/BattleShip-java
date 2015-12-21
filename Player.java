public class Player {
	private String name;
	private Ship aircraftCarrier;
	private Ship battleship;
	private Ship sub;
	private Ship cruiser;
	private Ship destroyer;
	private Ship[] shipList = {aircraftCarrier, battleship, sub,
		cruiser, destroyer};
	
	public Player(String name) {
		this.name = name;
		aircraftCarrier = new Ship(5);
		battleship = new Ship(4);
		sub = new Ship(3);
		cruiser = new Ship(3);
		destroyer = new Ship(2);
	}

	public void placeShips() {
		int length = 0;
		char = 'z';
		int level = 0;
		for (Ship ship : shipList) {
			System.out.println("Do you want the ship to be [H]orizontal" 
				+ "or [V]ertical?");
			if ('V' || 'v') {

			} else {
				
			}
		}
	}
}