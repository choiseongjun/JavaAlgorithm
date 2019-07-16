package Search;

public class EastTwo {
	 
	   public static int solution(int[] a) {
		   int neckCnt[] = new int[100];
		   int visited[] = new int[100];
		   int i;
		   int neckIndex = 0;
		   int max = 0;
		   /// 초기화를 이곳에 
		   for(i = 0; i < 10; i++)
		   {
			   visited[i]=0;
			   neckCnt[i]=0;
		   }
		   for(i=0;i<a.length;i++) {
			   int index=i;

			   if(visited[index]==1)
			   {
				   continue;
			   }
			   while(visited[index]!=1)
			   {
				   visited[index]=1;
				   index=a[index];
				   neckCnt[neckIndex]++;
			   }
			   neckIndex++;
		   }
		   for(i = 0; i < 100; i++)
		   {
		      if(neckCnt[i] > max)
		      {
		         max = neckCnt[i];
		      }
		   }
		   return max;
	   }
	public static void main(String[] args) {	
		int[] a= {5,4,0,3,1,6,2};
		System.out.println(solution(a));
	}
}
