package linkedlist;

public class LinkedListTest {

    public static void main(String[] args) {
        final Node head = createLinkedList();
        addElement(head,new Node(15));
        print(head);
        System.out.println("reverse");
        Node newhead = reverse(head);
        print(newhead);
    }

    private static  Node createLinkedList() {
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

    public static  void  addElement(Node head,Node node){
        if(head == null){
            head = node;
        } else {
            Node curr = head;
            while (curr.getNext() !=null){
                curr = curr.getNext();
            }
            curr.setNext(node);
        }
    }

    public static void print(Node head){
        Node start = head;

        while(start!=null){
            System.out.println(start.getData());
            start = start.getNext();
        }
    }

    public static Node reverse(Node head){
        if(head == null){
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node next = curr.getNext();

        while (next != null){
            curr.setNext(prev);
            prev = curr;
            curr = next;
            next = next.getNext();
        }
        curr.setNext(prev);
        return curr;
    }
}
