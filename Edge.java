package axcruzlopez;

public class Edge {
	int source, destination, weight;
	
	
		public Edge(int s, int d, int w) {
			this.source = s;
			this.destination = d;
			this.weight = w;
		}
		
		@Override
		public String toString() {
			String ret = "(";
			ret += Integer.toString(source);
			ret += ", " + Integer.toString(destination);
			ret += ", " + Integer.toString(weight);
			ret += ")";
			return ret;
		}
		

}
