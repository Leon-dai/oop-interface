package a05interfacedemo5;

public class Test {
    public static void main(String[] args) {
        PingPangSportsman pps = new PingPangSportsman("马龙", 30);
        System.out.println(pps.getName() + ", " + pps.getAge());
        pps.speakEnglish();
        pps.study();
        System.out.println("------------------------------------");

        BasketballSportsman bs = new BasketballSportsman("库里", 35);
        System.out.println(bs.getName() + ", " + bs.getAge());
        bs.study();
        System.out.println("------------------------------------");

        PingPangCoach ppc = new PingPangCoach("刘国梁", 40);
        System.out.println(ppc.getName() + ", " + ppc.getAge());
        ppc.speakEnglish();
        ppc.teach();
        System.out.println("------------------------------------");

        BasketballCoach bc = new BasketballCoach("姚明", 45);
        System.out.println(bs.getName() + ", " + bs.getAge());
        bc.teach();
    }
}
