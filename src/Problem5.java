public class Problem5 {
    public static void main(String[] args){
        Graph input = new Graph();

        input.addEdge("A", "B", 2);
        input.addEdge("A", "C", 3);
        input.addEdge("B", "D", 2);
        input.addEdge("C", "D", 4);
        input.addEdge("D", "E", 1);
        input.addEdge("E", "F", 2);
        input.addEdge("F", "G", 1);
        input.addEdge("G", "H", 2);
        input.addEdge("H", "I", 1);

        String u = "A";
        String w = "F";
        int length = 7;

        System.out.println("Simple paths from " + u + " to " + w + " with length " + length + ": ");
        input.findPaths(u,w,length);
    }
}
