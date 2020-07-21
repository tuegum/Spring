package tuegum.ioc.ioc01;

public class AMDCpu implements ICpu {
    @Override
    public void run() {
        System.out.println("AMD cpu start...");
    }
}
