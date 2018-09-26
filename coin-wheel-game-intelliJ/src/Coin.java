public class Coin {

    private CoinState state;

    public Coin(CoinState state){
        this.state = state;
    }

    public CoinState getState() {
        return state;
    }

    public void flip() {

        if (state == CoinState.Heads)
            state = CoinState.Tails;
        else
            state = CoinState.Heads;
    }
}
