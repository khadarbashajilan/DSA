public class CircularQueue_Array {
    static int arr[];
    static int size;
    static int rear;
    static int front;

    CircularQueue_Array(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }

    public static boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public static boolean isFull() {
        return (rear + 1) % size == front;
    }

    // ADD
    public static void add(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        // ADD 1st element
        if (front == -1) {
            front = 0;
        } 
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        // Remove
    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int result = arr[front];
        //When removing a Last element
        if(rear==front){
            rear=front=-1;
        }
        else{
            //If it is not last element of circular queue
            front=(front+1)%size;
        }
        return result;
    }       
    //peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return-1;
        }
        return arr[front];
    }
        public static void main(String[] args) {
            CircularQueue_Array q = new CircularQueue_Array(5);
            q.add(1);
            q.add(2);
            q.add(3);
            System.out.println(q.remove());
            q.add(4);
            System.out.println(q.remove());
            q.add(5);


            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
    
    