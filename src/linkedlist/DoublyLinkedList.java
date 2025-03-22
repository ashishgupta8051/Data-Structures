package linkedlist;

public class DoublyLinkedList {
    DNode head;

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insertAtBeginning(1);
//        doublyLinkedList.insertAtBeginning(2);
        doublyLinkedList.traverse();
    }

    public void insertAtBeginning(int data){
        DNode node = new DNode(data);
        if (head != null) {
            node.nextNode = head;
            head.prevNode = node;
        }
        head = node;
    }

    public void traverse(){
        if (head == null){
            System.out.print("Linked list is null");
            return;
        }

        DNode current = head;
        while (current != null){
            System.out.print(current.value + " ");
            current = current.nextNode;
        }
        System.out.println();
    }



}

class DNode {
    int value;
    DNode nextNode;
    DNode prevNode;

    public DNode(int value) {
        this.value = value;
        this.nextNode = null;
        this.prevNode = null;
    }
}
