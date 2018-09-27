package coinwheelgame;

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

    public void flipCoin() {
        coin.flip();
    }

    public CoinState getCoinState(){
        return coin.getState();
    }

}
