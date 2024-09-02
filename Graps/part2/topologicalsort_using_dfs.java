import java.util.*;

public class topologicalsort_using_dfs {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[2].add(new Edge(2,1));

    }
    public static void topsort(ArrayList<Edge>[]graph){
        boolean vis []= new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i<graph.length; i++){
            if(!vis[i]){
                topsortUtil(graph,i,vis,s);
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop()+" ");
        }
    }
    public static void topsortUtil(ArrayList<Edge>[]graph, int curr, boolean vis[], Stack<Integer> s){
        vis[curr]=true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                topsortUtil(graph, e.dest, vis, s);
            }
        }
        s.push(curr);
    }
    public static void main(String[] args) {
        int v= 3;
        ArrayList<Edge> graph [] =new ArrayList[v];
        creategraph(graph);
        topsort(graph);
    }
}