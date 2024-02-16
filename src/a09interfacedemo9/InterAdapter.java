package a09interfacedemo9;

public class InterAdapter implements Inter{
    /**
     * 1.当一个接口中抽象方法过多，但是我只要使用其中一部分的时候，就可以适配器设计模式
     * 2.书写步骤：
     *      编写中间类XXXAdapter，实现对应的接口
     *      对接口中的抽象方法进行空实现
     *      让真正的实现类继承中间类，并重写需要用的方法
     *      为了避免其他类创建适配器类的对象，中间的适配器类
     *      用abstract进行修饰
     */

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }

    @Override
    public void method4() {

    }

    @Override
    public void method5() {

    }

    @Override
    public void method6() {

    }

    @Override
    public void method7() {

    }
}
