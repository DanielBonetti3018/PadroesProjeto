package padroesestruturais.bridge;

public class BasicControl extends RemoteControl {
    public BasicControl(Device device) {
        super(device);
    }
    @Override
    public void powerOn() {
        device.turnOn();
    }
    @Override
    public void powerOff() {
        device.turnOff();
    }
    @Override
    public void adjustVolume(int volume) {
        device.setVolume(volume);
    }
}