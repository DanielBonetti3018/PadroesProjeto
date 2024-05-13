package padroesestruturais.bridge;
import org.junit.Test;
import static org.junit.Assert.*;

public class RemoteControlTest {

    @Test
    public void testTVRemoteControl() {
        Device tv = new Tv();
        RemoteControl tvRemote = new BasicControl(tv);

        tvRemote.powerOn();
        assertTrue(((Tv) tv).isOn());

        tvRemote.adjustVolume(20);
        assertEquals(20, ((Tv) tv).getVolume());

        tvRemote.powerOff();
        assertFalse(((Tv) tv).isOn());
    }

    @Test
    public void testDVDRemoteControl() {
        Device dvd = new DvdPlayer();
        RemoteControl dvdRemote = new BasicControl(dvd);

        dvdRemote.powerOn();
        assertTrue(((DvdPlayer) dvd).isOn());

        dvdRemote.adjustVolume(15);
        assertEquals(15, ((DvdPlayer) dvd).getVolume());

        dvdRemote.powerOff();
        assertFalse(((DvdPlayer) dvd).isOn());
    }
}
