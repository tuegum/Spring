package tuegum.ioc.ioc01;


import java.lang.reflect.Field;

/**
 * 电脑工厂，创建电脑对象
 */
public class ComputerFactory {

    public ComputerTest2 createComputer() throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        //获得Computer类型
        Class clazz = ComputerTest2.class;
        //创建Computer对象
        Object computer = clazz.newInstance();
        //获得cpu和memory属性
        Field cpu = clazz.getDeclaredField("mCpu");
        //读取属性上的注解
        ComputerComponent cpuComp = cpu.getDeclaredAnnotation(ComputerComponent.class);
        //读取注解中的type
        Class cpuType = cpuComp.type();
        //创建cpu对象配置到cpu属性上
        Object cpuObj = cpuType.newInstance();
        cpu.setAccessible(true);
        //通过Computer对象调用属性实现赋值
        cpu.set(computer,cpuObj);

        //获得cpu和memory属性
        Field memory = clazz.getDeclaredField("mMemory");
        //读取属性上的注解
        ComputerComponent memoryComp = memory.getDeclaredAnnotation(ComputerComponent.class);
        //读取注解中的type
        Class memoryType = memoryComp.type();
        //创建cpu对象配置到cpu属性上
        Object memoryObj = memoryType.newInstance();
        memory.setAccessible(true);
        //通过Computer对象调用属性实现赋值
        memory.set(computer,memoryObj);
        return (ComputerTest2) computer;
    }

}
