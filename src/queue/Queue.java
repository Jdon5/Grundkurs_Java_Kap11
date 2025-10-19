package queue;


public class Queue {
    private Node head;
    private Node tail;

    static class Node{
        private int data;
        private Node next;
    }

    public void enter(int x) {
        Node neu = new Node();
        neu.data = x;
        if (head == null) {
            head = tail = neu;
        } else {
            tail.next = neu;
            tail = neu;
        }
    }

    public int leave() {
        if (head == null) {
            return 0;
        }
        int x = head.data;
        head = head.next;
        if (head == null) {
            tail = null; // falls jetzt leer
        }
        return x;
    }


    public Iterator iterator(){
        class IteratorImpl implements Iterator {
            private Queue.Node e = head;
            public boolean hasNext(){
                return e!=null;
            }

            public Integer next(){
                if(e == null){
                    return null;
                }
                Integer data = e.data;
                e = e.next;
                return data;
            }
        }
        return new IteratorImpl();
    }

}
