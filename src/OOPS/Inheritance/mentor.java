package OOPS.Inheritance;

import java.util.List;

public class mentor extends User{
    private List<Student> mentees;
    private String description;

    public List<Student> getMentees() {
        return mentees;
    }

    public void setMentees(List<Student> mentees) {
        this.mentees = mentees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
