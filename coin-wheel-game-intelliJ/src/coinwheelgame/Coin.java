package coinwheelgame;

import java.util.Random;

public class Coin {

    private CoinState state;

    public Coin(CoinState state){
        this.state = state;
    }

    public Coin() {
        this.state = CoinState.findByState(new Random().nextBoolean());
    }

    public CoinState getState() {
        return state;
    }

    public void flip() {

        if (state == CoinState.HEADS)
            state = CoinState.TAILS;
        else
            state = CoinState.HEADS;
    }
}
