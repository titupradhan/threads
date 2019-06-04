package linkedlist;

public class NthNodeFromLast {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        //System.out.println(nthNodeFromLast(head, 2).data);
        System.out.println(recurNthNode(head, 2).data);
    }

    static Node nthNodeFromLast(Node head, int nth) {
        Node n = null;
        Node curr = head;

        for (int i = 0; i < nth; i++) {
            if (curr != null) {
                curr = curr.next;
            }
        }
        if (curr != null) {
            n = head;
        }
        while (curr != null) {
            curr = curr.next;
            n = n.next;
        }
        return n;
    }
    static  int c = 0;
    static Node recurNthNode(Node head, int n) {
        if (head.next != null) {
            recurNthNode(head.next, n);
            c++;
            if(c == n) return head;
        }
        return null;


    }

    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
