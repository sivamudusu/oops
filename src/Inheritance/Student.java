package Inheritance;

import com.sun.jdi.event.StepEvent;

public class Student extends User{
    private String batch;
    private double psp;
    private mentor mentor;


    void updatepassword(String newpass){
        setPassword(newpass);
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public Inheritance.mentor getMentor() {
        return mentor;
    }

    public void setMentor(Inheritance.mentor mentor) {
        this.mentor = mentor;
    }
}
