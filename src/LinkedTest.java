public class LinkedTest {


    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void add(Node head, Node n) {
        while (head.next != null) {
            head = head.next;
        }
        head.next = n;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node head = n1;
        add(head, new Node(2));
        add(head, new Node(3));
        add(head, new Node(4));
        add(head, new Node(12));
        add(head, new Node(33));
        add(head, new Node(44));

        System.out.println("Head current position :" + head.data);

        print(head);
        System.out.println("Head current position :" + head.data);
    }

}
