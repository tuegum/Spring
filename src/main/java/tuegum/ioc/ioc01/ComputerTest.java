package tuegum.ioc.ioc01;

import org.junit.Test;

public class ComputerTest {

    @Test
    public void computerTest(){
        System.out.println("computer run...");
        ICpu mCpu = new AMDCpu();
        IMemory mMemory = new IntelMemory();
        mCpu.run();
        mMemory.read();
        mMemory.write();
    }

    @Test
    public void test2(){
        ComputerTest2.start();
    }
}
