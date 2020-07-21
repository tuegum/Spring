package tuegum.ioc.ioc01;

public class AMDMemory implements IMemory {
    @Override
    public void write() {
        System.out.println("AMD Memory write...");
    }

    @Override
    public void read() {
        System.out.println("AMD Memory read...");
    }
}
