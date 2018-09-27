import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The wheel class exposes the public API that an interface may
 * use to play the game.
 *
 * @author Jon Bowen
 * @version 0.0.1
 */
public class Wheel {

    private List<Slot> _slots;  // list of wheel slots
    private int _startPosition; // position that spin landed on

    private long RANDOM_SEED = 2018;
    private Random _rng = new Random(RANDOM_SEED);

    /**
     * Constructor for wheel.
     *
     * @param numSlots The number of slots to include in the wheel
     */
    public Wheel(int numSlots) {
        _slots = new ArrayList<Slot>(numSlots);
        _startPosition = 0;

        // random initial coin configuration
        for (int i = 0; i < numSlots; i++) {
            Coin c;
            if (_rng.nextBoolean() == true)
                c = new Coin(CoinState.Heads);
            else
                c = new Coin(CoinState.Tails);

            Slot s = new Slot(c, false);
            _slots.add(s);
        }
    }

    /**
     * @return A string displaying the wheel state starting
     * from _startPosition
     */
    public String wheelInfoAsString() {
        String positionStr = "";
        String stateStr = "";

        int position = _startPosition;
        int slotsProcessed = 0;

        while (slotsProcessed < _slots.size()) {
            positionStr += (slotsProcessed + 1) + " ";
            Slot s = _slots.get(position);
            if (s.isHidden()) {
                stateStr += "* ";
            } else {
                CoinState state = s.getCoinState();
                if (state == CoinState.Heads)
                    stateStr += "H ";
                else
                    stateStr += "T ";
            }

            slotsProcessed++;
            position = (position + 1) % _slots.size();
        }

        return positionStr + System.lineSeparator() + stateStr;
    }

    /**
     * Randomly chooses a new _startPosition for the wheel
     */
    public void spin() {
        _startPosition = (int) (_rng.nextDouble() * _slots.size());
    }

}
