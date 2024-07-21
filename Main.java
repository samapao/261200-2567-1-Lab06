public class Main {
    public static void main(String[] args) {
        Cow a = new Cow();
        a.sound();

        Duck b = new Duck();
        b.sound();
        b.fly();
        b.glide();
        b.clean(a);

        Duck mk = new PekingDuck();
        mk.clean(a);

        mk.pet();
    }

}