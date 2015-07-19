public class Field {
	private static String[][] map = new String[10][10];

	public Field() {
		map = new String[10][10];
	}

	public String getLocation(int one, int two) {
		return map[one][two];
	}

	public void setLocation(int one, int two, String st) {
		map[one][two] = st;
	}

	public void startGame() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				setLocation(i, j, "W");
			}
		}
	}

	// public static void main(String[] args) {
	// 	//Field k = new Field();
	// 	for (int i = 0; i < 10; i++) {
	// 		System.out.println("");
	// 		for (int j = 0; j < 10; j++) {
	// 			map[i][j] = "W";
	// 			if (i == j) {
	// 				map[i][j] = "Quit";
	// 			}
	// 			System.out.print(map[i][j] + ", ");
	// 		}
	// 	}
	// }
}