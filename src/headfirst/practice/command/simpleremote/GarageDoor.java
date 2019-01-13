package headfirst.practice.command.simpleremote;

/**
 * @author jerry
 * @create 2018/12/2 00:24
 */
public class GarageDoor {
    public GarageDoor() {
    }

    public void up() {
        System.out.println("GarageDoor is open.");
    }

    public void down() {
        System.out.println("GarageDoor is closed.");
    }

    public void stop() {
        System.out.println("GarageDoor is stopped");
    }

    public void lightOn() {
        System.out.println("Garage light is on");
    }

    public void lightOff() {
        System.out.println("Garage light is off");
    }
}
