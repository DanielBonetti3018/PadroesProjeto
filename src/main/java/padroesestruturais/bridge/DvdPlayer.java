package padroesestruturais.bridge;

public class DvdPlayer implements Device{
    private boolean isOn = false;
    private int volume = 0;
    @Override
    public void turnOn() {
        isOn = true;
    }
    @Override
    public void turnOff() {
        isOn = false;
    }
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public boolean isOn() {
        return isOn;
    }
    public int getVolume() {
        return volume;
    }
}

