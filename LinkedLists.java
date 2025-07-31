
public class LinkedLists {

    Node head;
    private int size;

    LinkedLists() {
        this.size = 0;
    }

    

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size ++;
        }
    }

    //add - first, last 
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add - last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node curNode = head;
        while (curNode.next != null) {
            curNode = curNode.next;
        }

        curNode.next = newNode;
    }

    //print 
    public void printList() {
        if (head == null) {
            System.out.print("list is empty");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }

        System.out.println("Null");

    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        size --;    
        head = head.next;
    }

    //delete last
    public void deleteLast() {
        if (head == null) {
            System.out.println("the list is empty");
            return;
        }
        size --; 
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public void printSize(){
        System.out.println(size);
    }

    public static void main(String[] args) {
        LinkedLists l1 = new LinkedLists();
        l1.addFirst("a");
        l1.addFirst("is");
        l1.addLast("list");
        l1.addFirst("this");
        l1.deleteLast();
        l1.deleteFirst();
        l1.printList();
        l1.printSize();
    }
}
