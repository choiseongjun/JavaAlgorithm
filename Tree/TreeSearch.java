package Tree;

import java.util.LinkedList;

/*
 * 노드 사이의 경로:방향 그래프가 주어졌을 때 두노드 사이에 경ㄹ호가 존재하는지
 *확인하는 알고리즘을 작성하여
 * */
public class TreeSearch {

	enum State{Unvisited,Visited,Visiting};
	
	boolean search(Graph g,Node start,Node end) {
		if(start==end) return true;
		
		LinkedList q=new LinkedList();
		
		for(Node u: g.getNo)
	}
}
