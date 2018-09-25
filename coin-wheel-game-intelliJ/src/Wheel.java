import java.util.ArrayList; //to hold the slots
import java.util.Random; //to make random booleans for random coin states

public class Wheel {
	private int numberOfSlots;
	ArrayList slots;

	public Wheel (int numSlots) {
		numberOfSlots = numSlots;
		Random coinRandomizer = new Random();
		slots = new ArrayList<Slot>(numSlots);
		for (int i = 0; i < slots.size(); i++) {
			boolean coinState = coinRandomizer.nextBoolean(); //randomize a coin
			slots.set(i, new Slot(new Coin(coinState), true)); //make a new slot with our new coin state, set to hidden
		}
	}

	public void spin() {

	}
	
}
