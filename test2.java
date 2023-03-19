public class LinkedList {
    Node head; // head of the linked list

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Method to print the linked list
    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(25);
        list.head.next = new Node(78);
        list.head.next.next = new Node(56);
        list.head.next.next.next = new Node(34);
        list.head.next.next.next.next = new Node(56);
        list.head.next.next.next.next.next = new Node(78);
        list.head.next.next.next.next.next.next = new Node(90);

        System.out.println("Original Linked List:");
        list.printList();

        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList();
    }
}
