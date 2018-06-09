package device;

/**
 * Created by mitsram on 15/05/2018.
 */
public class DeviceFactory {

    public IDevice getDevice(String device)
    {
        if (device.equalsIgnoreCase("android")) {
            return new Android();
        }
        return null;
    }
}
