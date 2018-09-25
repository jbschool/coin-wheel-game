public class Slot {
	private boolean hidden;
	private Coin coin;
	
	public Slot(Coin aCoin, boolean isHidden) {
		coin = aCoin;
		hidden = isHidden;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void hide() {
		hidden = true;
	}

	public void show() {
		hidden = false;
	}

	public int viewCoin() {
		if (hidden) {
			return 2;
		} else {
			if (coin.getState()) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	public void flipCoin() {
		coin.flip();
	}
	
}
