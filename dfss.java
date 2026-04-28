public class dfss {
    

    static final int READY = 1;
    static final int WAITING = 2;
    static final int PROCESSED = 3;

    public static void dfs(int[][] graph, int start) {
        int n = graph.length;

        int[] status = new int[n];
        int[] stack = new int[n];

        int top = -1;

        for (int i = 0; i < n; i++) {
            status[i] = READY;
        }

        // Step 2: Push starting node
        stack[++top] = start;
        status[start] = WAITING;

        System.out.print("DFS: ");

        
        while (top != -1) {

            // Step 4: Pop top node
            int node = stack[top--];
            System.out.print(node + " ");

            status[node] = PROCESSED;

            // Step 5: Push all adjacent READY nodes
            for (int i = n - 1; i >= 0; i--) {
                if (graph[node][i] == 1 && status[i] == READY) {
                    stack[++top] = i;
                    status[i] = WAITING;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] graph = {
            {0, 1, 1, 0},
            {1, 0, 1, 1},
            {1, 1, 0, 0},
            {0, 1, 0, 0}
        };

        dfs(graph, 0);
    }
}

