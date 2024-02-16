package a05interfacedemo5;

public class BasketballSportsman extends Sportsman{
    public BasketballSportsman() {
    }

    public BasketballSportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员正在学打篮球");
    }
}
