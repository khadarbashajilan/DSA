import java.util.*;


public class Disjoint_set {
    static int n=7;
    static int par[]=new int[n];
    static int rank[]=new int[n];

    public static void init(){
        for(int i=0; i<n; i++){
            par[i]=i;
        }
    }
    public static int find(int x){
        if(x==par[x]){
            return x;
        }
        return par[x]=find(par[x]);
    }
    public static void union(int a, int b){
        int par_a=find(a);
        int par_b=find(b);
        
        if(rank[par_a]==rank[par_b]){
            par[par_b]=par[a];
            rank[par_a]++;
        }else if(rank[par_a]<rank[par_b]){
            par[par_a]=par[par_b];
        }else{
            par[par_b]=par_a;
        }
    }
    public static void main(String[] args) {
        init();
        union(1, 3);
        System.out.println(find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);
        }}