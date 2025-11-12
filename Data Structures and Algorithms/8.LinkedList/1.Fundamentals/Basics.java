import java.util.*;
public class Basics {
    static class Node {
        public int data;
        public Node next;

        public Node (int data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        Node y1 = new Node(arr.get(0),null);
        Node y2 = new Node(arr.get(1),null);
        Node y3 = new Node(arr.get(2),null);
        Node y4 = new Node(arr.get(3),null);

        // link nodes into a list
        y1.next = y2;
        y2.next = y3;
        y3.next = y4;

        // traverse and print to use the nodes
        System.out.println(y1.data + " " + y1.next);
        System.out.println(y2.data + " " + y2.next);
        System.out.println(y3.data + " " + y3.next);
        System.out.println(y4.data + " " + y4.next);
    }

}
