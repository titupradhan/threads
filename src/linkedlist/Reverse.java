package linkedlist;

public class Reverse {

    public static void main(String[] args) {


        Node<Integer> head = new Node<>(1);
        head.setNext(new Node<>(2));
        head.getNext().setNext(new Node<>(3));
        head.getNext().getNext().setNext(new Node<>(4));

        //print(head);
        //System.out.println("******************");


        Head newHead = new Head();
        reverse(head,newHead);
        print(newHead.head);


    }

    static class Head{
        public Node<Integer> head;
    }

    public static void reverse(Node<Integer> head,Head newHead){

        if(head.getNext() == null){
            newHead.head = head;
            return ;
        }
        reverse(head.getNext(),newHead);
        System.out.println(head.getData());
        head.getNext().setNext(head);
        head.setNext(null);
    }


    private static void print(Node<Integer> head){
        Node<Integer> curr = head;

        while (curr!=null){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }
}
