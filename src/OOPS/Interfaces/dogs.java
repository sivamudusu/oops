package OOPS.Interfaces;

public class dogs extends mammals implements herbivore{
    @Override
    public void eatPlant() {
        System.out.println("dog is eating plant");
    }
}
