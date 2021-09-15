package QuestionC;

public class Main {
    public static void main(String[] args) {
        LRUCache lc = new LRUCache(4);
        lc.takeFromCache(10);
        lc.display();
        lc.takeFromCache(20);
        lc.display();
        lc.takeFromCache(30);
        lc.display();
        lc.takeFromCache(40);
        lc.display();
        lc.takeFromCache(50);
        lc.display();
        lc.takeFromCache(60);
        lc.display();
    }
}