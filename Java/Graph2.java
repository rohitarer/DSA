import java.util.*;
import java.util.LinkedList;

// 1. Connected Components

// public class Graph2 {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }
//         // Vertex 1
//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1));

//         // Vertex 2
//         graph[1].add(new Edge(1, 0, 1));
//         graph[1].add(new Edge(1, 3, 1));

//         // Vertex 3
//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));

//         // Vertex 4
//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));
//         graph[3].add(new Edge(3, 5, 1));

//         // Vertex 5
//         graph[4].add(new Edge(4, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         // Vertex 6
//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1));

//         // Vertex 7
//         graph[6].add(new Edge(6, 5, 1));
//     }

//     // bfs

//     public static void bfs(ArrayList<Edge> graph[]) {
//         boolean vis[] = new boolean[graph.length];
        
//         for(int i=0; i<graph.length; i++) {
//             if(!vis[i]) {
//                 bfsUtil(graph, vis);
//             }
//         }
//     }

//     public static void bfsUtil(ArrayList<Edge> graph[], boolean vis[]) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(0);

//         while(!q.isEmpty()) {
//             int curr = q.remove();

//             if(!vis[curr]) {
//                 System.out.print(curr + " ");
//                 vis[curr] = true;
//                 for(int i=0; i<graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }


//     // dfs
//     public static void dfs(ArrayList<Edge> graph[]) {
//         boolean vis[] = new boolean[graph.length];

//         for(int i=0; i<graph.length; i++) {
//             if(!vis[i]) {
//                 dfsUtil(graph, i, vis);
//             }
//         }
//     }
//     public static void dfsUtil(ArrayList<Edge> graph[], int curr, boolean vis[]) {
//         System.out.print(curr + " ");
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);

//             if(!vis[e.dest]) {
//                 dfsUtil(graph, e.dest, vis);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         /*
//          *            1 --- 3
//          *           /      | \
//          *          0       |  5 -- 6
//          *           \      | /
//          *            2 --- 4
//          */ 

//         int V = 7;

//         ArrayList<Edge> graph[] = new ArrayList[V];

        
//         createGraph(graph);
//         bfs(graph);
//         System.out.println();
//         dfs(graph);
//     }
// }


// 2. 
// TC - O(V+E)

public class Graph2 {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static boolean detectCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++) {
            if(!vis[i]) {
                if(detectCycleUtil(graph, vis, 0, i)) {
                    return true;
                    //cycle exists in one of the parts
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int par) {
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // case 3
            if(!vis[i]) {
                if(detectCycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            } 
            // case 1
            else if (vis[e.dest] && e.dest != par) {
                return true;
            }
            // case 2 -> do nothing -> continue
        }
        return false;
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // Vertex 1
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        // Vertex 2
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // Vertex 3
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        // Vertex 4
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        // Vertex 5
        graph[4].add(new Edge(4, 3));
    }

    public static void main(String[] args) {
        /*
         *          0 ------ 3
         *         /|        |
         *        / |        |
         *       1  |        4
         *        \ |
         *         \|
         *          2
         */ 

        int V = 7;

        ArrayList<Edge> graph[] = new ArrayList[V];

        
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}