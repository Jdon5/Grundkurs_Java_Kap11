package lokale_klasse;

public class Test {
    public static void main(String[] args) {
        Liste liste = new Liste();
        liste.add("Element 1");
        liste.add("Element 2");
        liste.add("Element 3");

        Iterator it = liste.iterator();

        while(it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
        }

    }
}
