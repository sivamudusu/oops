package tries;

import java.util.HashMap;

public class trieNode {
    int pfcount;
    HashMap<Character,trieNode> child;
    int isEnd;

    public trieNode(){
        pfcount = 0;
        child = new HashMap<Character,trieNode>();
        isEnd = 0;

    }
}
