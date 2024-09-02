public class Backtracking_on_Array {
    public static void changeArray(int arr[], int val, int i)
    {
        //Base case
        if(i==arr.length)
        {
            printArr(arr);
            return;
        }
        //Recursion
        arr[i]=val;
        changeArray(arr, val+1, i+1);
        arr[i]=arr[i]-2;            //Backtracking step

    }
    public static void printArr(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= new int[5];
        changeArray(arr, 1, 0);
        printArr(arr);
    }
}
