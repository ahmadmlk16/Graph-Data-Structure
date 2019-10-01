package AhmadMalik;

public class ShortestPath{

    public void algorithm(int graph[][]) 

    {
        int[] Var = new int[12];
        int min = 999, nxtNode = 0;
        int[] dist = new int[12];
        int[] visited = new int[12];
        
        for (int i = 0; i < 12; i++) {
            visited[i] = 0;
            Var[i] = 0;
            for (int j = 0; j < dist.length; j++) {

                if (graph[i][j] == 0) {
                    graph[i][j] = 999;
                }
            }
        }

        dist = graph[0];
        visited[0] = 1;
        dist[0] = 0;

        for (int counter = 0; counter < 12; counter++) {
            min = 999;
            for (int i = 0; i < 12; i++) {
                if (min > dist[i] && visited[i] != 1) {
                    min = dist[i];
                    nxtNode = i;
                }
            }
            visited[nxtNode] = 1;
            for (int i = 0; i < 12; i++) {
                if (visited[i] != 1) {
                    if (min + graph[nxtNode][i] < dist[i]) {
                        dist[i] = min + graph[nxtNode][i];
                        Var[i] = nxtNode;

                    }
                }
            }
        }
        
        int j;
        for (int i = 0; i < 12; i++) {
            if (i != 0) {
                System.out.println("Path to "+(i+1)+":");
                System.out.print("Path = " + (i + 1));
                j = i;
                do {
                    j = Var[j];
                    System.out.print(" <- " + (j + 1));
                } while (j != 0);
                System.out.println("");
            }
            System.out.println();
        }
    }
}

