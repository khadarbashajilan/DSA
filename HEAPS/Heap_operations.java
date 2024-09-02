import java.util.*;
public class Heap_operations {
    static class Heap{
        ArrayList <Integer> arr = new ArrayList<>();
        public void add(int data){  //0(log n)
            //Add at last index
            arr.add(data);

            int x= arr.size()-1;//x is child index
            int par= (x-1)/2;// parent index

            while(arr.get(x)<arr.get(par)){     //'>' changed in while loop for MAX heap
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x=par;
                par=(x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        public int remove(){
            int data = arr.get(0);

            //swap first amd last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //delete last
            arr.remove(arr.size()-1);

            //heapify
            heapify(0);
            return data;
        }
        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx= i;

            if(left<arr.size() && arr.get(minIdx)>arr.get(left)){   //'<' changed in loop for MAX heap
                minIdx = left;
            }
            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){ //'<' changed in loop for MAX heap
                minIdx = right;
            }
            //swap
            if(minIdx!=i){
            int temp = arr.get(i);
            arr.set(i,arr.get(minIdx));
            arr.set(minIdx, temp);

            
            heapify(minIdx);
        }
    }
    public boolean isEmpty(){
        return arr.size()==0;
    }
}
//heap sort -
public static void heapsort(int arr[]){
    //step1 - build max heap
    int n= arr.length;
    for(int i=n-1; i>=0; i--){
        heapify(arr,i,n);
    }
    //step2 - push largest at the end
    for(int i=n-1; i>0; i--){
        //swap( largest first with last)
        int temp = arr[0];
        arr[0]= arr[i];
        arr[i]= temp;

        heapify(arr,0,i);
    }
}
public static void heapify (int arr[], int i, int size){
    int left = 2*i+1;
    int right = 2*i+2;
    int maxIdx= i;

    if(left<size && arr[left]>arr[maxIdx]){     //for decreasing order -> '<'
        maxIdx = left;
    }
    if(right<size && arr[right]> arr[maxIdx]){      //for decreasing order -> '<'
        maxIdx = right;
    }
    if(maxIdx!=i){
        //swap
        int temp = arr[i];
        arr[i]= arr[maxIdx];
        arr[maxIdx]= temp;

        heapify(arr, maxIdx, size);
    }
}


// public static void main(String[] args) {
//     Heap h = new Heap();
//     h.add(0);
//     h.add(5);
//     h.add(4);
//     h.add(3);

//     while(!h.isEmpty()){
//         System.out.println(h.peek());
//         h.remove();
//     }
// }
    public static void main(String[] args) {
        int arr[] ={2,3,5,4,6};
        heapsort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
