package QuestionC;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Iterator;

public class LRUCache {
    // maximum capacity of cache
    private static int size;
    // store keys of cache
    private Deque<Integer> elementQ;
    // store references of key in cache
    private HashSet<Integer> reference;

    LRUCache(int n) {
        elementQ = new LinkedList<>();
        reference = new HashSet<>();
        size = n;
    }

    public void takeFromCache(int x) {
        if (reference.contains(x)) {
            int position = 0, i = 0;
            Iterator<Integer> itr = elementQ.iterator();
            while (itr.hasNext()) {
                if (itr.next() == x) {
                    position = i;
                    break;
                }
                i++;
            }
            elementQ.remove(position);
        }
        // if x is not in the hash then we take out the least recently use element
        else {
            if (elementQ.size() == size) {
                int last = elementQ.removeLast();
                reference.remove(last);
            }
        }
        elementQ.push(x);
        reference.add(x);
    }

    // output contents of cache
    public void display() {
        Iterator<Integer> itr = elementQ.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }
}