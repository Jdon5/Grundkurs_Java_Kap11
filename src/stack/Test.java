package stack;

public class Test {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();

        Iterator iterator = stack.iterator();

        while(iterator.hasNext()){
            System.out.println((Integer) iterator.next());
        }
    }
}
