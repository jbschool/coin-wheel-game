import org.junit.Test;
import coinwheelgame.*;

public class SlotTest {
    private Slot slot;

    @Test()
    public void slotTest() {
        Coin hCoin = new Coin(CoinState.HEADS);
        Coin tCoin = new Coin(CoinState.TAILS);

        slot = new Slot(hCoin, true);
        assert(slot.getCoinState() == CoinState.HEADS);
        assert(slot.isHidden() == true);

        slot = new Slot(hCoin, false);
        assert(slot.getCoinState() == CoinState.HEADS);
        assert(slot.isHidden() == false);

        slot = new Slot(tCoin, true);
        assert(slot.getCoinState() == CoinState.TAILS);
        assert(slot.isHidden() == true);
    }

    @Test()
    public void hideTest() {
        slot = new Slot(new Coin(CoinState.HEADS), false);

        slot.hide();
        assert(slot.isHidden() == true);

        slot.show();
        assert(slot.isHidden() == false);
    }

    @Test()
    public void flipCoinTest() {
        slot = new Slot(new Coin(CoinState.HEADS), false);

        slot.flipCoin();
        assert(slot.getCoinState() == CoinState.TAILS);

        slot.flipCoin();
        assert(slot.getCoinState() == CoinState.HEADS);
    }
}
