package AccessModifiers;

public class Student {

//    if the acces modifier is nothing means its is default
//    if the access modifier is default we cant access thi from another package aswell as sub package

    private String name;
    private String email;
    float psp;
    String password;
    String status;

    public void changeEmail(String newEmail){
        email = newEmail;
    }
    public void changepassword(String newPassword){
        password = newPassword;
    }
}
