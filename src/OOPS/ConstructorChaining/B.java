package OOPS.ConstructorChaining;

public class B extends A{
    private int c;

    B(){
//B        super("shiva");
//        when the constructor cant start due to some reasons like no parameters or absence of constructor
//        we can call super() with specified parameters
//        it will call the constructor
        System.out.println("constructor of B");
    }

}
