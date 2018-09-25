public class Runner {
	public static void main(String[] args) {
		Coin myCoin = new Coin(true);

		System.out.println("State: " + myCoin.getState());

		myCoin.flip();
		
		System.out.println("State after flip: " + myCoin.getState());

		System.out.println("putting the coin in a slot...");

		Slot mySlot = new Slot(myCoin, true);

		System.out.println("Hidden view state: " + mySlot.viewCoin());

		mySlot.show();

		System.out.println("Shown view state: " + mySlot.viewCoin());

		mySlot.flipCoin();

		System.out.println("Shown view state after flip: " + mySlot.viewCoin());
	}
}
