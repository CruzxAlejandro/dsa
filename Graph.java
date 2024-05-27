package axcruzlopez;
import java.util.ArrayList;
import java.util.HashMap;
import axcruzlopez.Edge;
import axcruzlopez.Node;   
import java.util.PriorityQueue;


public class Graph {
	// Key is the vertices structured as a NODE. 
	// Value is an arraylist of it's edges that contains (source, destination, weight)
	
	HashMap<Integer, ArrayList<Edge>> adjacencyList;
	
	/*
		key = 0 value = {(0, 1, 8), (0, 2 ,8), (0, 7, 4)}
		key = 1 value = {(0, 1, 8), (			
	*/	
	
	public Graph() {
		this.adjacencyList = new HashMap<>();
	}
	
	public Boolean addVertex(int vertex) {
		if(this.adjacencyList.get(vertex) == null) {
			adjacencyList.put(vertex, new ArrayList<Edge>());
			return true;
		}
		return false;
	}
	
	public Boolean addEdge(int source, int destination, int weight ) {
		if(this.adjacencyList.get(source) != null) {
			this.adjacencyList.get(source).add(new Edge(source, destination, weight));
			return true;
		}
		
		
		return false;
	}
	
	public void calculatePaths(int source) {
		ArrayList<Integer> visitedSource = new ArrayList<>();
		ArrayList<Edge> sourceEdges = new ArrayList<>();
		PriorityQueue<Integer> unVisited = new PriorityQueue<>();	/// destinations unexplored
			
		
		/// For each vertex in the graph,
		///	*	distance = inf
		/// *	previous = none
		/// 		
		/// Set all the vertices to unexplored
		/// while a destination is unexplored
		/// v = least unexplored vertex
		/// set v to explored
		
		/// First run calculate paths
		/// Second find the shortest path by tracing back. 
		
		for(int vertices : this.adjacencyList.keySet()) {
			Node currentV = new Node(vertices);
			currentV.setDistance(Integer.MAX_VALUE);
			if(currentV.getValue() == source) {
				currentV.setDistance(0);
			}
			currentV.setPrev(null);
			unVisited.add(currentV.getValue());
		}
		System.out.println(unVisited.toString());
		
		
		
		
		
	}
	
	public void printGraph() {
		for(int key: this.adjacencyList.keySet()) {
			System.out.println("Key: " + key + " : Value: " + this.adjacencyList.get(key).toString());
		}
	}
	
	
}
