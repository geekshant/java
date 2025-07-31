class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class Ll {
    Node head;

    // Insert at end
    public void insert(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Reverse the linked list iteratively
    public void reverseIterate() {
        if (head == null || head.next == null) return;

        Node prevNode = null;
        Node curNode = head;
        Node nextNode;

        while (curNode != null) {
            nextNode = curNode.next;
            curNode.next = prevNode;
            prevNode = curNode;
            curNode = nextNode;
        }

        head = prevNode;
    }

    // Display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class ReverseLl {
    public static void main(String[] args) {
        Ll list = new Ll();
        list.insert("A");
        list.insert("B");
        list.insert("C");
        list.insert("D");

        System.out.println("Original List:");
        list.display();

        list.reverseIterate();

        System.out.println("Reversed List:");
        list.display();
    }
}
