import org.junit.Test;

public class SlotTest {
    private Slot slot;

    @Test()
    public void slotTest() {
        Coin hCoin = new Coin(CoinState.Heads);
        Coin tCoin = new Coin(CoinState.Tails);

        slot = new Slot(hCoin, true);
        assert(slot.getCoinState() == CoinState.Heads);
        assert(slot.isHidden() == true);

        slot = new Slot(hCoin, false);
        assert(slot.getCoinState() == CoinState.Heads);
        assert(slot.isHidden() == false);

        slot = new Slot(tCoin, true);
        assert(slot.getCoinState() == CoinState.Tails);
        assert(slot.isHidden() == true);
    }

    @Test()
    public void hideTest() {
        slot = new Slot(new Coin(CoinState.Heads), false);

        slot.hide();
        assert(slot.isHidden() == true);

        slot.show();
        assert(slot.isHidden() == false);
    }

    @Test()
    public void flipCoinTest() {
        slot = new Slot(new Coin(CoinState.Heads), false);

        slot.flipCoin();
        assert(slot.getCoinState() == CoinState.Tails);

        slot.flipCoin();
        assert(slot.getCoinState() == CoinState.Heads);
    }
}
