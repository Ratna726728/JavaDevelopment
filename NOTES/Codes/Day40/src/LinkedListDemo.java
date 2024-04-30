import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(60);

        linkedList.addFirst(90);
        linkedList.addLast(89);

        int a = linkedList.get(3);

        System.out.println("4th index"+a );
        System.out.println("first way: "+linkedList);

        Iterator<Integer> itr = linkedList.iterator();
        while(itr.hasNext()){
            System.out.println("second way using iterator:"+itr.next());
        }
        for(Integer t :linkedList){
            System.out.println("third way using for each loop:"+t);
        }

    }
}
