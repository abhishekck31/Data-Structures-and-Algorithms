import java.util.*;
public class traversal {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int data1){
            val = data1;
            next = null;
        }
        ListNode(int data1, ListNode next1){
            val = data1;
            next = next1;
        }
    }
    public List<Integer> NodeTraversal(ListNode head){
        ListNode temp = head;
        List<Integer> ans = new ArrayList<>();
        while (temp != null) {
            ans.add(temp.val);
            temp = temp.next;
        }
        return ans;
    }
    public static void main (String[] args){
        traversal obj = new traversal();
        ListNode head = obj.new ListNode(10);
        head.next = obj.new ListNode(20);
        head.next.next = obj.new ListNode(30);
        head.next.next.next = obj.new ListNode(40);

        List<Integer> result = obj.NodeTraversal(head);
        System.out.println(result);
    }
}
