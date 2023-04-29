package constructors;

public class Student {
    String name;
    String email; //if tou want all students default addres to be same unless provide String address = "scaler";//
    String address;
    float psp;
    String batch;

//    if you didnt created a constructor java will automatically creates one for you with all of its attributes
//    values to default value
//    if you created a constructor you must use that only java wont create this time
    Student(String newname,String newMail){
        name = newname;
        email = newMail;
//        this constructor creates a student with email and name with given parameter remining attributes will be default

    }

    Student(){
//        this is default constructor
    }

//    now we will create a copy constructor which takes a student as input and creates new student using that input
//    student credentials;
    Student(Student other){
        name = other.name;
        email = other.email;
        batch = other.batch;
        psp = other.psp;
        address = other.address;
    }

}
