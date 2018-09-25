public class Coin {
	private boolean state;

	public Coin(boolean initialState) {
		state = initialState;
	}
	
	public boolean getState() {
		return state;
	}

	public void flip() {
		state = !state;
	}
}
