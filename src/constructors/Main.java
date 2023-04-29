package constructors;

public class Main {
    public  static  void main(String[] args){
        Student s1 = new Student("shiva","sivamudusu@gmail");
        s1.address = "scaler";
        s1.batch = "oct-2022";
        s1.psp = 10;


        Student copyOfs1 = new Student(s1);
//        with this line we created a new sudent called copyofs1 with credentials of s1
//        our created copy will be called as shallow copy
//        depp copy means no shared elements or entities
//        in java its impossible to deepcopy



    }


}
