package tuegum.ioc.ioc01;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        ComputerFactory computerFactory = new ComputerFactory();
        ComputerTest2 computer = computerFactory.createComputer();
        computer.start();
    }
}
