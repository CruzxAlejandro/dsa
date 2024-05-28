package axcruzlopez;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import axcruzlopez.Edge;
import axcruzlopez.Node;   
import java.util.PriorityQueue;


public class Graph {
	// Key is the vertices structured as a NODE. 
	// Value is an arraylist of it's edges that contains (source, destination, weight)
	
//	HashMap<Node, ArrayList<Edge>> adjacencyList;
	HashMap<Integer, Node> nodes;
    HashMap<Node, ArrayList<Edge>> adjacencyList;
	
	/*
		key = 0 value = {(0, 1, 8), (0, 2 ,8), (0, 7, 4)}
		key = 1 value = {(0, 1, 8), (			
	*/	
	
	public Graph() {
		this.nodes = new HashMap<>();
		this.adjacencyList = new HashMap<>();
	}
	
	public Boolean addVertex(int vertex) {
		if(!nodes.containsKey(vertex)) {
			Node vertexNode = new Node(vertex);
			nodes.put(vertex, vertexNode);
			adjacencyList.put(vertexNode, new ArrayList<Edge>());
			return true;
		}
		return false;
	}
	
	public Boolean addEdge(int source, int destination, int weight ) {
		Node vertexNode = nodes.get(source);
		Node destinationNode = nodes.get(destination);
		if(vertexNode != null && destinationNode != null) {
            adjacencyList.get(vertexNode).add(new Edge(source, destination, weight));
            adjacencyList.get(destinationNode).add(new Edge(destination, source, weight));
            return true;
		}
		
		return false;
	}
	
	public void calculatePaths(int source) {
		PriorityQueue<Node> unVisited = new PriorityQueue<>();	/// destinations unexplored
		ArrayList<Node> visited = new ArrayList<>();
		for(int key : this.nodes.keySet()) {
			Node currentV  = this.nodes.get(key);
			if(currentV.getValue() == source) {
				currentV.setDistance(0);
			} else {				
				currentV.setDistance(Integer.MAX_VALUE);
			}
			currentV.setPrev(null);
			unVisited.add(currentV);
		}
		
		Node currentV;
		while(!unVisited.isEmpty()) {
            currentV = unVisited.poll();
            if(visited.contains(currentV) && !unVisited.contains(currentV)) {
            	return;
            }
            System.out.println("vertex: " + currentV.getValue());
            for(Edge edge : adjacencyList.get(currentV)) {
//            	System.out.println("Edge: " + edge.destination);
            	Node adjV = this.nodes.get(edge.getDestination());
//            	System.out.println(adjV.getValue());
//            	System.out.println(edgeWeight);
            	int edgeWeight = edge.getWeight();
                int alternativePath = currentV.getDistance() + edgeWeight;
                if (alternativePath < adjV.getDistance()) {
                	adjV.setDistance(alternativePath);
                	adjV.setPrev(currentV);
                	unVisited.add(adjV);
                }
            }
            visited.add(currentV);
		}
	}
	
    public void shortestPath(int source) {
    	Node findMe = this.nodes.get(source);
    	List<Node> path = new ArrayList<>();
    	for(Node node = findMe; node != null; node = node.getPrev()) {
    		path.add(node);
    	}
    	Collections.reverse(path);
    	for(Node node : path) {
    		System.out.print(node.getValue() + " -> ");
    	}
    	System.out.println(" Total Distance: " + findMe.getDistance());
    }

	
	public void printGraph() {		
		for(int key: this.nodes.keySet()) {
			System.out.println("Vertex: " + key + " : Edges: " + this.adjacencyList.get(this.nodes.get(key)).toString());
		}
	}
	
	
}
