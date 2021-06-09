package lesson7;

public class Test7 {

    public static void main(String[] args) {
//        testGraph();
//        testDfs();
//        testBfs();
        homework();
    }

    private static void homework() {
        Graph graph = new GraphImpl(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");
        graph.addVertex("Воронеж");


//        graph.addEdge("Москва", "Тула", "Рязань", "Калуга");
//        graph.addEdge("Тула", "Липецк");
//        graph.addEdge( "Рязань", "Тамбов");
//        graph.addEdge( "Калуга","Орел");
//        graph.addEdge( "Липецк","Воронеж");
//        graph.addEdge( "Тамбов","Саратов");
//        graph.addEdge( "Орел","Курск");
//        graph.addEdge( "Саратов","Воронеж");
//        graph.addEdge( "Курск", "Воронеж");

        System.out.println(graph.bfsShortWay("Москва","Воронеж"));


    }

    private static void testDfs() {
        Graph graph = new GraphImpl(7);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A", "B", "C", "D");
        graph.addEdge("B", "E");
        graph.addEdge("D", "F");
        graph.addEdge("F", "G");

        graph.dfs("A");
        //A B E C D F G
    }

    private static void testBfs() {
        Graph graph = new GraphImpl(8);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        graph.addEdge("A", "B", "C", "D");
        graph.addEdge("B", "E");
        graph.addEdge("E", "H");
        graph.addEdge("C", "F");
        graph.addEdge("D", "G");

        graph.bfs("A");
    }

    private static void testGraph() {
        Graph graph = new GraphImpl(4);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B", "C");
        graph.addEdge("B", "A", "C", "D");
        graph.addEdge("C", "A", "B", "D");
        graph.addEdge("D", "B", "C");

        System.out.println("Size of graph is " + graph.getSize());
        graph.display();
    }
}
