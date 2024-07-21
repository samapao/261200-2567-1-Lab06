public class Duck extends Animal implements Flyable,Pettable {
    @Override
    public void sound() {
        System.out.println("Quack");
    }
    @Override
    public void fly(){
        System.out.println("I can fly");
    }
    @Override
    public void glide(){
        System.out.println("I am gliding");
    }
    
    public void clean(Animal animal){
        System.out.println(this + "is cleaning " + animal);
    }
    @Override
    public void pet(){
        sound();
    }
}