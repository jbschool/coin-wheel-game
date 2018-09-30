import org.junit.Test;
import coinwheelgame.*;

public class CoinTest {
    private Coin coin;

    @Test()
    public void coinTest() {
        coin = new Coin(CoinState.HEADS);
        assert(coin.getState() == CoinState.HEADS);

        coin = new Coin(CoinState.TAILS);
        assert(coin.getState() == CoinState.TAILS);
    }

    @Test()
    public void flipTest() {
        coin = new Coin(CoinState.HEADS);
        coin.flip();
        assert(coin.getState() == CoinState.TAILS);

        coin.flip();
        assert(coin.getState() == CoinState.HEADS);
    }
}
