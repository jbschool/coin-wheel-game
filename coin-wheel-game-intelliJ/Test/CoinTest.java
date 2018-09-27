import org.junit.Test;
import coinwheelgame.*;

public class CoinTest {
    private Coin coin;

    @Test()
    public void coinTest() {
        coin = new Coin(CoinState.Heads);
        assert(coin.getState() == CoinState.Heads);

        coin = new Coin(CoinState.Tails);
        assert(coin.getState() == CoinState.Tails);
    }

    @Test()
    public void flipTest() {
        coin = new Coin(CoinState.Heads);
        coin.flip();
        assert(coin.getState() == CoinState.Tails);

        coin.flip();
        assert(coin.getState() == CoinState.Heads);
    }
}
