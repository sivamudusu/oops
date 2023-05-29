package OOPS.Polymorphism;

public class student extends user{
    String batch;
    double psp;
    mentor mentor;

    void changeBatch(){
        System.out.println("student batch has changeed");
    }

    @Override
    void changeEmail() {
        System.out.println("changing email in student");
    }
}
