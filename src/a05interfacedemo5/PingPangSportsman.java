package a05interfacedemo5;

public class PingPangSportsman extends Sportsman implements SpeakEnglish{
    public PingPangSportsman() {
    }

    public PingPangSportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员正在学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员正在说英语");
    }
}
