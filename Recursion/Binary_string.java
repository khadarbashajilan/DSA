public class Binary_string {
    public static void NO_CONSECUTIVE_ONE(int n, int lastplace, String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        NO_CONSECUTIVE_ONE(n-1, 0, str+"0");
        
        if(lastplace==0)
        {
            NO_CONSECUTIVE_ONE(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        
        NO_CONSECUTIVE_ONE(3, 0, "");   }
}
