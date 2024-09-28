


public class ReverseLinkedList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
           this.data=data;
           this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addFirst(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
      if(head==null){
        System.out.println("LL is empty");
        return;
      }
      Node temp=head;
      while(temp!=null){
        System.out.print(temp.data+ "->");
        temp=temp.next;
      }
      System.out.println("null");
    }
    public static void reverseList(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
  public static void main(String[] args) {
    ReverseLinkedList ll= new ReverseLinkedList();
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);
    ll.print();

    ll.reverseList();
    ll.print();   
  }
}
