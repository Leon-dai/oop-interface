package a02interfacedemo2;
    /*成员变量
        只能是常量，默认修饰符：public static final
    构造方法
        没有
    成员方法
        只能是抽象方法，默认修饰符：public abstract
        JDK7以前：接口中只能定义抽象方法*/
public class Test {
    public static void main(String[] args) {
        //创建实现类对象并调用方法
        InterImpl ii = new InterImpl();
        ii.method();
    }
}
