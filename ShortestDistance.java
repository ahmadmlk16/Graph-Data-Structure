package AhmadMalik;
class ShortestDistance
{
    static final int X=12;


    void algorithm (int graph[][], int value)
    {
        int Dist[] = new int[X]; 
        Boolean Var[] = new Boolean[X];

        for (int i = 0; i < X; i++)
        {
            Dist[i] = Integer.MAX_VALUE;
            Var[i] = false;
        }
        Dist[value] = 0;

        for (int count = 0; count < X-1; count++)
        {
            int u = minDist(Dist, Var);
            Var[u] = true;
            for (int v = 0; v < X; v++)
                if (!Var[v] && graph[u][v]!=0 && Dist[u] != Integer.MAX_VALUE && Dist[u]+graph[u][v] < Dist[v])
                    Dist[v] = Dist[u] + graph[u][v];
        }

        printSol(Dist, X);
    }
    int minDist(int Dist[], Boolean Var[])
    {
        int min = Integer.MAX_VALUE, min_index=-1;

        for (int v = 0; v < X; v++)
            if (Var[v] == false && Dist[v] <= min)
            {
                min = Dist[v];
                min_index = v;
            }
        return min_index;
    }
    void printSol(int Dist[], int n)
    {
        System.out.println("Vertex distance from Source");
        for (int i = 0; i < X; i++){
            System.out.println("Shortest distance from Node 1 to Node "+(i+1)+" is");
            System.out.println(Dist[i]);
        }

    }
}