import javax.jws.WebService;

class LinkedList {
 
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    /* Function to reverse the linked list */
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
       int count=0 ;
        while (current != null) {
            next = current.next;//next 15 curr.next 15
            
           current.next = prev;// prev=85
           prev = current;//prev 15
           current = next; //85
          count++;  
        

        
        
        }
        node = prev;
        return node;
    }
 
    // prints content of double linked list
   // @WebService
    void printList(Node node) {
        while (node != null) {
        	//SSystem.out.println("Is the node null");
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
         
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("heads data"+ " ");
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
 
 