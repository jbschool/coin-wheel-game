import org.junit.Test;

public class WheelTest {

    @Test()
    public void wheelTest()
    {
        Wheel wheel = new Wheel(6);

        String wheelString = wheel.wheelInfoAsString();
        long headsCount = wheelString.chars().filter(ch -> ch == 'H').count();
        long tailsCount = wheelString.chars().filter(ch -> ch == 'T').count();

        assert(headsCount+tailsCount == 6);
    }

}
