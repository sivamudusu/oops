package Interfaces;

public class cat extends mammals implements carnivore {
    @Override
    public void eatAnimal() {
        System.out.println("cat eats animsls");
    }
}
