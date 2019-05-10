package linkedlist;

public class IntersectionPoint {

    public static void main(String[] args) {


        Node<Integer> head1 = new Node<>(1);
        head1.setNext(new Node<>(2));
        head1.getNext().setNext(new Node<>(3));
        head1.getNext().getNext().setNext(new Node<>(4));
        head1.getNext().getNext().getNext().setNext(new Node<>(5));


        Node<Integer> head2 = new Node<>(0);
        head2.setNext(new Node(-1));
        head2.getNext().setNext(head1.getNext().getNext());

        int size1 = size(head1);
        int size2 = size(head2);


        int n = 0;
        int i=0;
        if (size1 > size2) {
            n = size1 - size2;
            while(i<n){
                head1 = head1.getNext();
            }
        } else if (size2 > size1) {
            n = size2 - size1;
            while (i<n){
                head2 = head2.getNext();
            }
        }

        while(head1 !=head2){
            head1 = head1.getNext();
            head2 = head2.getNext();
        }

        System.out.println(head1.getData());

    }

    public static void print(Node<Integer> head) {
        System.out.println();
        while (head != null) {
            System.out.println(head.getData());
            head = head.getNext();
        }
    }

    public static int size(Node<Integer> head) {
        int s = 0;
        while (head != null) {
            s++;
            head = head.getNext();
        }
        return s;
    }
}
