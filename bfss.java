public class bfss {

    static int READY = 1;
    static int WAITING = 2;
    static int PROCESSED = 3;

    public static void bfs(int[][] graph, int start) {
        int n = graph.length;

        int[] status = new int[n];
        int[] queue = new int[n];

        int front = 0, rear = 0;

        for (int i = 0; i < n; i++) {
            status[i] = READY;
        }

        queue[rear++] = start;
        status[start] = WAITING;

        System.out.print("BFS: ");

        while (front < rear) {
            int node = queue[front++];
            System.out.print(node + " ");

            status[node] = PROCESSED;

            for (int i = 0; i < n; i++) {
                if (graph[node][i] == 1 && status[i] == READY) {
                    queue[rear++] = i;
                    status[i] = WAITING;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] graph = {
            {0, 1, 0, 1},
            {1, 0, 1, 0},
            {1, 1, 0, 1},
            {0, 1, 1, 0}
        };

        bfs(graph, 0);
    }
}