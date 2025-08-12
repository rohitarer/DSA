import java.util.*;
import java.util.LinkedList;

// 1. Creating a Graph (Adjacency List)
// public class Graph1 {
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
//     public static void main(String[] args) {
//         /*
//          *              (5)
//          *          0 ------- 1
//          *                   / \
//          *              (1) /   \ (3)
//          *                 /     \
//          *                2 ----- 3
//          *                |  (1)
//          *            (2) |
//          *                |
//          *                4
//          */ 

//         int V = 5;

//         ArrayList<Edge> graph[] = new ArrayList[V];

//         for(int i=0; i<V; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         // Vertex 1
//         graph[0].add(new Edge(0, 1, 5));

//         // Vertex 2
//         graph[1].add(new Edge(1, 0, 5));
//         graph[1].add(new Edge(1, 2, 1));
//         graph[1].add(new Edge(1, 3, 3));

//         // Vertex 3
//         graph[2].add(new Edge(2, 1, 1));
//         graph[2].add(new Edge(2, 3, 1));
//         graph[2].add(new Edge(2, 4, 2));

//         // Vertex 4
//         graph[3].add(new Edge(3, 1, 3));
//         graph[3].add(new Edge(3, 2, 1));

//         // Vertex 5
//         graph[4].add(new Edge(4, 2, 2));

//         for(int i=0; i<graph[2].size(); i++) {
//             System.out.println(graph[2].get(i).dest);
//         }
//     }
// }



// 2. BFS (Breadth First Search)
// TC - O(V+E)
// public class Graph1 {
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

//     public static void BFS(ArrayList<Edge> graph[]) {
//         Queue<Integer> q = new LinkedList<>();
//         boolean vis[] = new boolean[graph.length];
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
//         BFS(graph);
//     }
// }



// 3. DFS (Depth First Search)
// TC - O(V+E)

// public class Graph1 {
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

//     public static void DFS(ArrayList<Edge> graph[], int curr, boolean vis[]) {
//         System.out.print(curr + " ");
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);

//             if(!vis[e.dest]) {
//                 DFS(graph, e.dest, vis);
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
//         DFS(graph, 0, new boolean[V]);
//     }
// }



// 4. Has Path?
// TC - O(V+E)

// public class Graph1 {
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

//     public static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]) {
//         if(src == dest) {
//             return true;
//         }

//         vis[src] = true;

//         for(int i=0; i<graph[src].size(); i++) {
//             Edge e = graph[src].get(i);

//             if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
//                 return true;
//             }
//         }
//         return false;
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
//         System.out.println(hasPath(graph, 0, 4, new boolean[V]));
//     }
// }


