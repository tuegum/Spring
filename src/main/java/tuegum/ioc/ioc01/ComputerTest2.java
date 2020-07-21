package tuegum.ioc.ioc01;

public class ComputerTest2 {

    @ComputerComponent(type = AMDCpu.class)
    private static ICpu mCpu = null;
    @ComputerComponent(type = IntelMemory.class)
    private static IMemory mMemory = null;

    public static void start() {
        System.out.println("computer run...");

        mCpu.run();
        mMemory.read();
        mMemory.write();
    }

}
