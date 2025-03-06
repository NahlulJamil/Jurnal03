import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {
    private ListNode<E> firstNode;
    private ListNode<E> lastNode;
    private String name; 

    public SinglyLinkedList() {         
        this("linked list");     
    }
    
    public SinglyLinkedList(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public void insertAtFront(E insertItem) {
        ListNode newNode = new ListNode(insertItem);

        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        }else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    public void insertAtBack(E insertItem) {
        ListNode newNode = new ListNode<E>(insertItem);

        if (isEmpty()) {
            firstNode = lastNode = new ListNode<E>(insertItem);
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    public E removeFromBack() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }
        E removeItem = lastNode.data;

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            ListNode<E> current = firstNode;

            while (current.next != lastNode) {
                current = current.next;
            }
            lastNode = current;
            current.next = null;
        }
        return removeItem;
    }

    private boolean isEmpty() {
        return firstNode == null;
    }

    public E removeFromFront() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException(name + " is empty");
        }
        E  removeItem = firstNode.data;

        if (firstNode == lastNode) {
            firstNode = lastNode = null;
        } else {
            firstNode = firstNode.next;
        }
        return removeItem;
    }

    public void cariResep(String namaResep) {
        ListNode<E> current = firstNode;
        while (current != null) {
            if (current.data instanceof Resep) {
                Resep resep  = (Resep) current.data;
                if (resep.getNama().equals(namaResep)) {
                    System.out.println("Resep ditemukan: " + resep);
                    return;
                }
            }
            current = current.next;
        }
        System.out.println("Resep tidak ditemukan");
    }
    public void print(){
        if (isEmpty()) {
            System.out.printf("Empty %s %n", name);
            return;
        }

        System.out.printf("The %s %n", name);
        ListNode<E> current = firstNode;

        while (current != null) {
            System.out.printf("%s", current.data);
            System.out.println();
            current = current.next;
        }
        System.out.println();
     }
}