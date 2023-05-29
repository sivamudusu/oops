package trees;

public class Pair {
    Integer key;
    tree value;

    Pair(int x,tree b){
        key = x;
        value = b;
    }

    int getKey(){
        return key;
    }
    tree getValue(){
        return value;
    }
}
