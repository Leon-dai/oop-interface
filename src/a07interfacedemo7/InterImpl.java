package a07interfacedemo7;

public class InterImpl implements Inter{
    @Override
    public void method() {
        System.out.println("InterImpl中重写的抽象方法");
    }

    public static void show(){
        System.out.println("实现类中的静态方法");
    }
}
