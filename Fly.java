public class Fly extends Animal implements Flyable ,Pettable{
    @Override
    public void sound() {
        System.out.println("VIIIIII");
    }

    @Override
    public void fly(){
        System.out.println("I can fly");
    }

    @Override
    public void glide(){
        System.out.println("I am gliding");

    }

    @Override
    public void pet(){
        sound();
    }
}