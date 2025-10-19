package queue;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enter(1);
        queue.enter(2);
        queue.enter(3);
        queue.enter(4);
        System.out.println("Entferntes Objekt: "+queue.leave());


        Iterator iterator = queue.iterator();

        while(iterator.hasNext()){
            System.out.println((Integer) iterator.next());
        }
    }
}
