public class Ship {
	private int length;
	private int xHead;
	private int yHead;
	private int xTail;
	private int yTail;

	public Ship(int length, int xH, int yH, int xT, int yT) {
		this.length = length;
		if (xH != xT && yH != yT) {
			
		}
		xHead = xH;
		yHead = yH;
		xTail = xT;
		yTail = yT;
	}

	public int getLength() {
		return length;
	}

	public boolean isDead() {
		if (length == 0) {
			return true;
		}
		return false;
	}

	public void setLength() {
		length--;
	}


}