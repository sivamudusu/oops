package OOPS.Polymorphism;

import java.util.List;

public class Main {
    public static void deleteAllUserPasswords(List<user> users){
        for(user user:users){
            user.changeEmail();
            if(user instanceof student){
                System.out.println("iam student");
                student s2 = (student)user;
                s2.psp = 200;
                System.out.println(s2.password);
                System.out.println(s2.email);
                System.out.println(s2.psp);
            }
        }
    }
    public static void main(String[] args) {
        user user1 = new student();
        user1.email = "html2gmail.com";
        user user2 = new ta();
        user user3 = new mentor();
        user user4 = new user();

        List<user> users = List.of(
                user1,
                user2,
                user3,
                user4,
                new mentor(),
                new student()
        );
        deleteAllUserPasswords(users);

  }
}
