package linkedlist;

public class LinkedListTest {

    public static void main(String[] args) {
        Node<Integer> head = new Node(9);
       /* addElement(head, new Node(7));
        addElement(head, new Node(1));
        addElement(head, new Node(9));
        addElement(head, new Node(9));
        addElement(head, new Node(3));
        addElement(head, new Node(8));*/
        addElement(head, new Node(9));
        addElement(head, new Node(9));
        addElement(head, new Node(6));


        addDigitMain(head, 4);

        print(head);


    }

    private static Node createLinkedList() {
        Node<Integer> head = new Node<>(1);
        Node<Integer> second = new Node<>(2);
        head.setNext(second);
        Node<Integer> thrid = new Node<>(8);
        second.setNext(thrid);
        Node<Integer> fourth = new Node<>(6);
        thrid.setNext(fourth);
        Node<Integer> fifth = new Node<>(3);
        fourth.setNext(fifth);

        return head;
    }

    public static void addElement(Node head, Node node) {
        if (head == null) {
            head = node;
        } else {
            Node curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(node);
        }
    }

    public static void print(Node head) {
        Node start = head;

        while (start != null) {
            System.out.println(start.getData());
            start = start.getNext();
        }
    }

    public static Node reverse(Node head) {
        if (head == null) {
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node next = curr.getNext();

        while (next != null) {
            curr.setNext(prev);
            prev = curr;
            curr = next;
            next = next.getNext();
        }
        curr.setNext(prev);
        return curr;
    }

    private static int addDigit(Node<Integer> head, int digit) {
        if (head == null) {
            return digit;
        }

        int carry = addDigit(head.getNext(), digit);

        int sum = head.getData() + carry;
        head.setData(sum % 10);
        return sum / 10;
    }

    public static void addDigitMain(Node<Integer> head, int digit) {
        int carry = addDigit(head, digit);
        if (carry != 0) {
            Node node = new Node(head.getData());
            node.setNext(head.getNext());
            head.setNext(node);
            head.setData(carry);

        }
    }

}
