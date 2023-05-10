package Polymorphism;

public class ta extends user{
    String expertise;
    String company;

    void takeHelpRequest(){

    }

    @Override
    void changeEmail() {
        System.out.println("changing email in ta");
    }
}
