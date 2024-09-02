public class Quick_sort {
    public static void printarr(char arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int partition(char arr[], int si, int ei)
    {
        char pivot = arr[ei];
        int i =si-1;

        for(int j=si; j<ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                char temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }i++;
        char temp = pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void sort(char arr[], int si, int ei)
    {
        if(si>=ei)
        {
            return;
        }
        //last element
        int pIdx=partition(arr, si, ei);
        sort(arr, si, pIdx-1);      //left
        sort(arr, pIdx+1, ei);      //right
    }
    public static void main(String[] args) {
        char arr[]={'V','T','U', 'B', 'E'};
        sort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
