package Polymorphism;

public class mentor extends user{
    String description;
    int rating;

    void removeMentee(){

    }

    @Override
    void changeEmail() {
        System.out.println("changing email in mentor");
    }
}
