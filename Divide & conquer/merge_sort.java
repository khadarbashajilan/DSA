public class merge_sort {
    public static void printarr(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergesort (int arr[], int si, int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid = si+(ei-si)/2; //-> or (si+ei)/2
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr,si,mid,ei);

    }
    public static void merge(int arr[], int si, int mid, int ei)
    {
        int temp[] = new int [ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //For Leftover elements of 1st sorted part
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        //For leftover elements of 2nd sorted part
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }

        // copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8,-2};
        mergesort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
