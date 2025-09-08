        //  Circular Queue 
public class QueueImplementation {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(6);
        q.enqueue(9);
        q.enqueue(2);
        q.enqueue(8);
        // q.enqueue(4);
        q.show();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.show();
    }
}
class Queue{
    int que[] = new int[5];
    int front = -1;
    int rear = -1;
    public void enqueue(int n){
        if(rear == -1)
        {
            rear = 0;
            front = 0;
        }
        if(front == (rear+1)%5){
            System.out.println("Queue is full");
        }
        else{
        que[rear] = n;
        rear = (rear+1)%5;
        }
    }
    public int dequeue(){
        int data = 0;
        if(front == rear){
            System.out.println("Queue is empty");
        }
    else{
        data = que[front];
        front = (front+1)%5;
    }
    return data;
}
    public void show(){
      int i = front;
      System.out.println("Queue : ");
while (i != rear) {
    System.out.print(que[i] + " ");
    i = (i + 1) % 5;
}
System.out.println();
    }
}
