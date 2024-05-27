package axcruzlopez;
import axcruzlopez.Graph;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/// Some changes from my graph
		
		/// Directional , meaning 0 might point to 1, but 1 is not pointed to 0.
		/// Need to be weighted
		/// Use a priority queue, Java library is allowed *
		
		/// Need to find shortest path from 1 - 37 && 14 - 23
		/// Need to overwrite ToString for my edges so that Object isn't printed in array
		

		
		Graph weightedGraph = new Graph();
		
		for(int i = 0; i < 18; i++) {
			weightedGraph.addVertex(i);
		}
		
		for (int i = 20; i < 38; i++)
		{
			weightedGraph.addVertex(i);
		}
		
		weightedGraph.addEdge(0, 1, 8);
		weightedGraph.addEdge(0, 2, 8);
		weightedGraph.addEdge(0, 7, 4);
		weightedGraph.addEdge(0, 14, 4);
		weightedGraph.addEdge(0, 20, 8);

		// 1
		weightedGraph.addEdge(1, 5, 8);

		// 2
		weightedGraph.addEdge(2, 3, 5);
		weightedGraph.addEdge(2, 6, 2);

		// 3
		weightedGraph.addEdge(3, 17, 1);

		// 4
		weightedGraph.addEdge(4, 5, 7);
		weightedGraph.addEdge(4, 7, 3);
		weightedGraph.addEdge(4, 8, 5);

		// 5
		weightedGraph.addEdge(5, 6, 8);
		weightedGraph.addEdge(5, 8, 1);
		weightedGraph.addEdge(5, 25, 6);

		// 6 All edges added

		// 7
		weightedGraph.addEdge(7, 11, 1);

		// 8
		weightedGraph.addEdge(8, 11, 8);
		weightedGraph.addEdge(8, 12, 7);

		// 9
		weightedGraph.addEdge(9, 10, 6);
		weightedGraph.addEdge(9, 12, 9);
		weightedGraph.addEdge(9, 13, 3);

		// 10
		weightedGraph.addEdge(10, 13, 5);
		weightedGraph.addEdge(10, 17, 2);
		weightedGraph.addEdge(10, 30, 4);

		// 11
		weightedGraph.addEdge(11, 12, 2);
		weightedGraph.addEdge(11, 14, 6);

		// 12
		weightedGraph.addEdge(12, 13, 2);
		weightedGraph.addEdge(12, 15, 8);
		weightedGraph.addEdge(12, 16, 6);

		// 13
		weightedGraph.addEdge(13, 17, 9);

		// 14 All edges added

		// 15
		weightedGraph.addEdge(15, 35, 7);

		// 16
		weightedGraph.addEdge(16, 17, 1);

		// 17 All edges added

		// 20
		weightedGraph.addEdge(20, 21, 1);
		weightedGraph.addEdge(20, 24, 3);
		weightedGraph.addEdge(20, 27, 5);
		weightedGraph.addEdge(20, 34, 1);

		// 21
		weightedGraph.addEdge(21, 24, 1);

		// 22
		weightedGraph.addEdge(22, 23, 8);
		weightedGraph.addEdge(22, 25, 1);
		weightedGraph.addEdge(22, 26, 8);

		// 23
		weightedGraph.addEdge(23, 26, 2);
		weightedGraph.addEdge(23, 37, 2);

		// 24
		weightedGraph.addEdge(24, 27, 2);
		weightedGraph.addEdge(24, 28, 6);

		// 25
		weightedGraph.addEdge(25, 26, 7);
		weightedGraph.addEdge(25, 28, 1);
		weightedGraph.addEdge(25, 29, 6);

		// 26
		weightedGraph.addEdge(26, 29, 9);
		weightedGraph.addEdge(26, 30, 5);

		// 27
		weightedGraph.addEdge(27, 28, 5);
		weightedGraph.addEdge(27, 34, 7);

		// 28
		weightedGraph.addEdge(28, 31, 5);
		weightedGraph.addEdge(28, 32, 1);

		// 29
		weightedGraph.addEdge(29, 30, 1);
		weightedGraph.addEdge(29, 33, 5);

		// 30
		weightedGraph.addEdge(30, 37, 4);

		// 31
		weightedGraph.addEdge(31, 32, 4);
		weightedGraph.addEdge(31, 34, 3);
		weightedGraph.addEdge(31, 35, 9);

		// 32
		weightedGraph.addEdge(32, 33, 4);
		weightedGraph.addEdge(32, 36, 1);

		// 33
		weightedGraph.addEdge(33, 36, 7);

		// 34 All edges added

		// 35
		weightedGraph.addEdge(35, 36, 4);
		weightedGraph.addEdge(35, 37, 1);

		
		weightedGraph.printGraph();
		
//		weightedGraph.calculatePaths(1, 37);

	}

	
}