package OOPS.Inheritance;

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

    public OOPS.Inheritance.mentor getMentor() {
        return mentor;
    }

    public void setMentor(OOPS.Inheritance.mentor mentor) {
        this.mentor = mentor;
    }
}
