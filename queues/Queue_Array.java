public class Queue_Array {
    static int arr[];
    static int size;
    static int rear;

    Queue_Array(int n){
        arr=new int[n];
        size = n;
        rear = -1;

    }
    public static boolean isEmpty(){
        return rear==-1;

    }
    //ADD
    public static void add(int data){
        if(rear==size-1){
         System.out.println("Queue is empty");
         return;   
        }
        rear=rear+1;
        arr[rear]=data;

    }
    //Remove
    public static int remove(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return -1;
        }
        int front =arr[0];
        for(int i=0;i<rear; i++){
            arr[i]=arr[i+1];
        }
        rear=rear-1;
        return front;
    }
    //Peek
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return-1;

        }
        return arr[0];
    }
    public static void main(String[] args) {
        Queue_Array q = new Queue_Array(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
