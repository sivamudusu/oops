package Inheritance;

public class Instructor extends User{
    private String assignedbatch;
    private String topic;
    private String discrition ;

    public String getAssignedbatch() {
        return assignedbatch;
    }

    public void setAssignedbatch(String assignedbatch) {
        this.assignedbatch = assignedbatch;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDiscrition() {
        return discrition;
    }

    public void setDiscrition(String discrition) {
        this.discrition = discrition;
    }
}
