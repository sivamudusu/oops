package Interfaces;

public class humans extends mammals implements omnivore{

    @Override
    public void eatPlant() {
        System.out.println("human eats plants");
    }

    @Override
    public void eatAnimal() {
        System.out.println("human eats animal");
    }
}
