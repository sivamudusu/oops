package AccessModifiers;



public class Main {
    public static void main(String[] args){
        Student s1 = new Student();
//        s1.name = "shiva"; //since we changes access modifier to private it cannot be accessed
        s1.password = "helloworld";
//        s1.email = "sivamudusu@gmail.com";
        s1.psp = 100;
        s1.status = "Atcive";

        s1.changeEmail("mudususiva@gmail.com");
        s1.changepassword("saradha");

    }
}
