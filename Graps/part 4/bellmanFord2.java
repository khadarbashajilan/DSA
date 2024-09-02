import java.util.*;

public class bellmanFord2 {
    static class Edge{
        int src;
        int dest;
        int wt;
        
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void Creategraph2(ArrayList<Edge> graph){
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 2, -1));
    }
    public static void bellmanford(ArrayList<Edge> graph, int src, int v){
        int dist[]= new int[v];
        for(int i=0; i<dist.length ; i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for(int i=0; i<v-1; i++){
            for(int j = 0; j<graph.size(); j++){
                Edge  e = graph.get(j);
                int u=e.src;
                int V=e.dest;
                int wt = e.wt;

            if(dist[u] != Integer.MAX_VALUE && dist[u]+wt <dist[V]){
                dist[V] = dist[u]+wt;
            }
            }
        }
        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    } 

    public static void main(String[] args) {
        ArrayList<Edge> graph = new ArrayList<>();
        Creategraph2(graph);
        bellmanford(graph, 0, 5);
    }
}
