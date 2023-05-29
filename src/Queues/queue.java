package Queues;

public class queue {
    int front;
    int rear;
    int size;
    int[]queue;

    queue(){
        front = -1;
        rear = -1;
        size = 0;
        queue = new int[10];
    }
    boolean isEmpty(){
        return size == 0;
    }
    boolean isFull(){
        return size == queue.length;
    }
    int size(){
        return size;
    }
    void enqueue(int x){
        if(!isFull()){
            rear = (rear+1)%queue.length;
            queue[rear] = x;
            size++;
        }
    }
    int dequeue(){
        int ans = -1;
        if(!isEmpty()){
            front = (front+1)%queue.length;
            ans = queue[front];
            size--;
        }
        return ans;
    }
    int front(){
        int ans = -1;
        if(!isEmpty()){
            ans = queue[front+1];
        }
        return ans;
    }
}
