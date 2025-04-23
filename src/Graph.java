import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<String, List<Edge>> graph;

    public Graph(){
        graph = new HashMap<>();
    }

    public void addEdge(String u, String v, int weight){
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(new Edge(v, weight));
    }

    public void findPaths(String u, String w, int length){
        dfs(u, w, length, new ArrayList<>(List.of(u)), 0);
    }

    public void dfs(String current, String w, int length, List<String> path, int totalLength){
        if(totalLength > length){
            return;
        }
        if(current.equals(w) && totalLength == length){
            System.out.println(String.join(" -> ", path));
            return;
        }
        if(!graph.containsKey(current)){
            return;
        }
        for(Edge edge: graph.get(current)){
            if(!path.contains(edge.vertex)){
                path.add(edge.vertex);
                dfs(edge.vertex,w,length,path,totalLength + edge.weight);
                path.remove(path.size() - 1);
            }
        }
    }
}
