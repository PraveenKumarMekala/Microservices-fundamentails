import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Example {

    public static void main(String[] args) {

//        LinkedList<String> list = new LinkedList<>();
        /*list.add("Alice");
        list.addLast("Lisa");
        list.add("Bob");
        list.addFirst("Tara");
        list.add(0, "mike");*/
        ArrayList list = new ArrayList();
        list.add("Alice");
        list.add(Boolean.TRUE);
        list.add(1, "Bob");
        list.remove("true");
        list.add(1, "mike");
        list.add(4, "Tara");
        System.out.println(list);

        /*Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/
    }
}
