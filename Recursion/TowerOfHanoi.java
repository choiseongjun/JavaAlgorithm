package Recursion;

public class TowerOfHanoi {

	public void solveHanoi(int n,char rodFrom,char middleRod,char rodTo) {
		
		if(n==1) {
			System.out.println("Plate 1 from "+rodFrom+" to "+rodTo);
			return ;
		}
		
		solveHanoi(n-1, rodFrom, rodTo, middleRod);
		System.out.println("Plate"+n+"rodFrom"+"to"+rodTo);
		solveHanoi(n-1, middleRod, rodFrom, rodTo);
	}
	
	public static void main(String[] args) {
		TowerOfHanoi tower=new TowerOfHanoi();
		tower.solveHanoi(3, 'A', 'B', 'C');
	}
}
