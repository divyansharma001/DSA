package LinkedList.SinglyLL;

public class Main {
    public static void main(String[] args) {
     LL list = new LL();

        list.insertAtFirst(3);
        list.insertAtFirst(2);
        list.insertAtFirst(8);
        list.insertAtFirst(17);
        list.insertAtLast(23);
        list.insert(100, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}
