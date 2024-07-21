public class Cow extends Animal implements Pettable {

    @Override
    void sound(){
        System.out.println("Moo");
    }

    @Override
    public void pet(){
        sound();
    }
} 
