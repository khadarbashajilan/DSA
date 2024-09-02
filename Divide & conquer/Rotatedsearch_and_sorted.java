public class Rotatedsearch_and_sorted {
    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = (si + ei) / 2;

        if (arr[mid] == tar) {
            return mid;
        }
        // mid on L1
        if (arr[si] <= arr[mid]) {
            // case A : left L1
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // case B : right mid
                return search(arr, tar, mid + 1, ei);
            }
        }
        // mid on L2
        else{
            // case C : L1 right
            if(arr[mid]<= tar && tar<=arr[ei])
            {
                return search(arr, tar, mid+1, ei);
            }
            else
            {
                //case D : mid left
                return search(arr, tar, si, mid-1);
            }
        }
    }


    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr, 0, 0, arr.length-1));
    }
}
