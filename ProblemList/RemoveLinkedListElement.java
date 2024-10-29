public class RemoveLinkedListElement {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        size++;
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void removeElements(int val) {
        // Remove nodes from the start that match `val`
        while (head != null && head.data == val) {
            head = head.next;
            size--;
        }

        // Now handle the rest of the list
        Node current = head;
        while (current != null && current.next != null) {
            if (current.next.data == val) {
                current.next = current.next.next;
                size--;
            } else {
                current = current.next;
            }
        }

        // Update tail in case last node(s) were removed
        tail = current;
    }

    public static void main(String[] args) {
        RemoveLinkedListElement ll = new RemoveLinkedListElement();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(6);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        System.out.println("Original List:");
        ll.print();

        int target = 6;
        ll.removeElements(target);
        System.out.println("List after removing " + target + ":");
        ll.print();
    }
}
