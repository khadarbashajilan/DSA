import java.util.*;
public class Directed_graph_cycleDetect {
    static class Edge{
        int src;
        int dest;
    
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    static void creategraph(ArrayList<Edge>graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
    } 
    public static boolean isCycle(ArrayList<Edge> [] graph){
        boolean vis[] = new boolean[graph.length];
        boolean Stack[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(isCycleUtil(graph, i, vis, Stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge>[]graph, int curr, boolean vis[], boolean Stack[]){
        vis[curr]= true;
        Stack[curr]= true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(Stack[e.dest]){
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, Stack)){
                return true;
            }
        }
        Stack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creategraph(graph);
        System.out.print(isCycle(graph));
    }

}
