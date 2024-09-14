package linkedlist;

public class SinglyLinkedList {
    Node head = null;

    public void insertAtBeginning(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAtEnd(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }

        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        last.next = node;
    }

    public void insertAfterNode(int prevData, int data){
        Node current = head;
        while (current != null && current.value != prevData){
            current = current.next;
        }

        if (current == null){
            System.out.println("The specified node is not found.");
            return;
        }

        Node node = new Node(data);
        node.next = current.next;
        current.next = node;
    }

    public void deleteAtBeginning(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteEtTheEnd(){
        if (head == null){
            System.out.println("List is empty");
            return;
        }

        if (head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        while (secondLast.next.next != null){
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void deleteAfterNode(int prevData){
        Node node = head;
        while (node != null && node.value != prevData){
            node = node.next;
        }

        if (node == null || node.next == null){
            System.out.println("The specified node is not found or there is no node after it.");
            return;
        }

        node.next = node.next.next;
    }

    public boolean search(int data) {
        Node node = head;
        while (node != null){
            if (node.value == data){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public void traverse(){
        if (head == null){
            System.out.print("Linked list is null");
            return;
        }

        Node current = head;
        while (current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.insertAtBeginning(5);
        singlyLinkedList.insertAtBeginning(8);
        singlyLinkedList.insertAtEnd(9);
        singlyLinkedList.insertAtBeginning(15);
        singlyLinkedList.insertAtEnd(10);
        singlyLinkedList.insertAtEnd(11);
        singlyLinkedList.insertAfterNode(8, 12);
        System.out.println("List before deleting!");
        singlyLinkedList.traverse();
        singlyLinkedList.deleteAtBeginning();
        singlyLinkedList.deleteEtTheEnd();
        singlyLinkedList.deleteAfterNode(12);
        System.out.println("List after deleting!");
        singlyLinkedList.traverse();
        System.out.println("Is search number present in the list: "+singlyLinkedList.search(12));
    }
}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
