package LinkedList.DoublyLL;

public class DLL {
public class Node{
    int val;
    Node next;
    Node prev;

    public Node(int val){
        this.val = val;
    }

    public Node(int val, Node next, Node prev){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
}
