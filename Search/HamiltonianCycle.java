package Search;

public class HamiltonianCycle {

	private int numOfVertexes;
	private int[] hamiltonianPath;
	private int[][] adjacencyMatrix;

	public HamiltonianCycle(int[][] adjacencyMatrix) {
		this.adjacencyMatrix = adjacencyMatrix;
		this.hamiltonianPath = new int[adjacencyMatrix.length];
		this.numOfVertexes = adjacencyMatrix.length;

		this.hamiltonianPath[0] = 0;

		if (findFeasibleSolution(1)) {
			showHamiltonianPath();
		} else {
			System.out.println("no feasible soltuon");
		}
	}

	private void showHamiltonianPath() {
		// TODO Auto-generated method stub

	}

	private boolean findFeasibleSolution(int position) {

		if (position == numOfVertexes) {
			if (adjacencyMatrix[hamiltonianPath[position - 1]][hamiltonianPath[0]] == 1) {
				return true;
			} else {
				return false;
			}
		}

		for (int vertexIndex = 1; vertexIndex < numOfVertexes; ++vertexIndex) {

			if (isFeasible(vertexIndex, position)) {

				hamiltonianPath[position] = vertexIndex;

				if (findFeasibleSolution(position + 1)) {
					return true;
				}
			}
			return false;
		}
	}

	private boolean isFeasible(int vertexIndex, int position) {
		// TODO Auto-generated method stub
		return false;
	}
}
