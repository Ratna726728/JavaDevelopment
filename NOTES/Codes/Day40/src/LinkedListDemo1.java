import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(50);
        linkedList.add("raj");
        linkedList.add(10);
        linkedList.add("akola");
        linkedList.add(null);
        linkedList.addFirst("software");
        linkedList.add(2, "Roger");

        System.out.println(linkedList);

    }
}
