
public class Problem6 {

    public static void main(String[] args){
        Graph2 graph = new Graph2(6);


        graph.addNode(new Node('I'));
        graph.addNode(new Node('A'));
        graph.addNode(new Node('E'));
        graph.addNode(new Node('F'));
        graph.addNode(new Node('T'));
        graph.addNode(new Node('S'));

        graph.addEdge(0,2);
        graph.addEdge(0,4);
        graph.addEdge(1,0);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,4);
        graph.addEdge(3,5);
        graph.addEdge(3,1);
        graph.addEdge(4,0);
        graph.addEdge(4,2);
        graph.addEdge(5,2);

        graph.print();

    }


}

