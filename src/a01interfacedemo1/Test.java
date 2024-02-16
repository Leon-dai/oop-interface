package a01interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("旺财", 3);
        d.eat();
        d.swim();
        System.out.println(d.getName() + ", " + d.getAge());
        System.out.println("------------------------");

        Rabbit r = new Rabbit("玉兔", 2);
        r.eat();
        System.out.println(r.getName() + ", " + r.getAge());
        System.out.println("------------------------");

        Frog f = new Frog("青蛙", 4);
        f.eat();
        f.swim();
        System.out.println(f.getName() + ", " + f.getAge());
    }
}
