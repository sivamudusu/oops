package Queues;

public class Main {
    public static void main(String[] args){
        queue q = new queue();
        System.out.println("is empty :"+q.isEmpty());
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("dequeued :"+q.dequeue());
        System.out.println("is empty :"+q.isEmpty());
        System.out.println("size is :"+q.size());

    }
}
