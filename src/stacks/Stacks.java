package stacks;

public class Stacks {
    int top;
    int limit;
    int[]stack;

    Stacks(){
        top = -1;
        limit = 10;
        stack = new int[limit];
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top == limit-1;
    }
    void push(int x){
        if(!isFull()){
            top++;
            stack[top] = x;
        }
    }
    int pop(){
        int ans = -1;
        if(!isEmpty()){
            ans = stack[top];
            top--;
        }
        return ans;
    }
    int peek(){
        int ans = -1;
        if(!isEmpty()){
            ans = stack[top];
        }
        return ans;
    }
}
