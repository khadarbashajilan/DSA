public class occurence_inarray
{
    public static int lastoccurenece(int arr[], int key, int i)
    {
        if(i==0-1)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return lastoccurenece(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(lastoccurenece(arr, 5, arr.length-1));
        System.out.println();
        System.out.println(firstoccurenece(arr, 5, 0));

    }

    public static int firstoccurenece(int arr[], int key, int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
            if(arr[i]==key)
            {
                return i;
            }
            return firstoccurenece(arr, key, i+1);
        }
    
    }
