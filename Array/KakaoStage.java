package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class KakaoStage {

	class Fail{
		
		int stage;
		double rate;
		
		Fail(int stage,double rate){
		
			this.stage=stage;
			this.rate=rate;
		}
	}
	Comparator<Fail> comp=new Comparator<Fail>() {
		@Override
		public int compare(Fail a, Fail b) {
			if(a.rate<b.rate)
				return 1;
			else if(a.rate>b.rate)
				return -1;
			else {
				if(a.stage>b.stage)
					return 1;
				else if(a.stage<b.stage)
					return -1;
				else
					return 0;
			}
		}
	};
	
	public int[] solution(int N,int[] stages) {
		int[] answer=new int[N];
		List<Fail> fails=new ArrayList<Fail>();
		int total=stages.length;
		
		int[] users=new int[N+1];
		
		for(int s:stages) {
			users[s-1]++;//1번 스테이지 사용자가 0번째라서 -1한거임
		}
		
		for(int i=0;i<N;i++) {
			if(users[i]==0) {
				fails.add(new Fail(i+1, 0));
			}else {
				fails.add(new Fail(i+1,(double)users[i]/total));//현재 스테이지에 머물고 있는 사용자 수
				total-=users[i];//현재 머물고 있는 사용자수
			}
		}

		Collections.sort(fails,comp);
		for(int i=0;i<N;i++) {
			answer[i]=fails.get(i).stage;
			System.out.println(answer[i]);
		}
		return answer;
	}
	public static void main(String[] args) {
		int N=5;
		int[] stages= {2, 1, 2, 6, 2, 4, 3, 3};
		KakaoStage ka=new KakaoStage();
		ka.solution(N, stages);
	}
}
