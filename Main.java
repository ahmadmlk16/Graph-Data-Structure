package AhmadMalik;
public class Main

{
    public static void main (String[] args)
    {

        int graph[][] = new int[][]{
                {0, 5, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0},
                {5, 0, 8, 0, 9, 8, 0, 0, 0, 0, 0, 0},
                {0, 8, 0, 0, 6, 0, 0, 15,0, 0, 0, 0},
                {6, 0, 0, 0, 0, 4, 9, 0, 0, 0, 0, 0},
                {0, 9, 6, 0, 0, 0, 0, 0, 13,0, 0, 0},
                {0, 8, 0, 4, 0, 0, 6, 14,0, 0, 0, 0},
                {0, 0, 0, 9, 0, 6, 0, 0, 11,0, 0, 0},
                {0, 0, 15, 0, 0,14, 0,0, 9, 9, 0, 0},
                {0, 0, 0, 0, 13,0, 11,9, 0, 6, 5, 12},
                {0, 0, 0, 0, 0, 0, 0, 9, 6, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 12,0, 0, 0},
        };

        ShortestDistance Y = new ShortestDistance();
        Y.algorithm(graph, 0);
        ShortestPath Z = new ShortestPath();
        Z.algorithm(graph);

    }

}
