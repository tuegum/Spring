package tuegum.ioc.ioc01;

public class IntelMemory implements IMemory {
    @Override
    public void write() {
        System.out.println("Intel Memory write...");
    }

    @Override
    public void read() {
        System.out.println("Intel Memory read...");
    }
}
