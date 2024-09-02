public class setith_bit {
    public static int setIth(int n, int i){
    return n | (1<<i);
}
public static void main(String[] args) {
    System.out.println(setIth(5, 3));
    System.out.println(setIth(8,2));

}
}
