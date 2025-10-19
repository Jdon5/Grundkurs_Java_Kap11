package stack;

public class Stack {
    private Node top;
    private static class Node{
        private int data;
        private Node next;
    }

    public void push(Integer data){
        if(data == null)
            return;

        Node neu = new Node();
        neu.data = data;
        neu.next = top;
        top = neu;
    }

    public void pop(){
        if(top == null)
            return;
        else {
            top = top.next;
        }
    }

    public Iterator iterator(){
        class IteratorImpl implements Iterator{
            private Node e = top;
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
