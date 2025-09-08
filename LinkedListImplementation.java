public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(5);
        ll.insert(9);
        ll.insert(2);
        ll.insertAtStart(1);
        ll.insertAtPosition(0, 3);
        ll.show();
        System.out.println();
        ll.deleteAt(2);
        ll.show();
    }
}
class Node{
    int data;
    Node next;
}
class LinkedList{
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        if(head == null)
        {
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node; 
        }
    }
   
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
            node.next = head;
            head = node;
    }
    public void insertAtPosition(int index,int data){
        Node node = new Node();
        node.data = data;
        if(index == 0)
        {
            insertAtStart(data);
        }
        else{
            Node n = head;
            int count=0;
        while(count<index-1){
            n=n.next;
            count++;
        }
        node.next = n.next;
        n.next = node;
    }
}

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }
        else{
            Node n = head;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            Node n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }

    public void show(){
        Node n = head;
        while(n.next!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }
}
