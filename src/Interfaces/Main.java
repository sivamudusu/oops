package Interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<herbivore> herbivores = List.of(
                new humans(),
                new dogs()
        );
        for(herbivore herbivore:herbivores){
            herbivore.eatPlant();
        }
    }
}
