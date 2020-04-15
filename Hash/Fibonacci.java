package Hash;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	private Map<Integer,BigInteger> memozieHashMap = new HashMap<>();
	{
		memozieHashMap.put(0, BigInteger.ZERO);
		memozieHashMap.put(1, BigInteger.ONE);
		memozieHashMap.put(2, BigInteger.ONE);
	}
	
	private BigInteger fibonacci(int n) {
		if(memozieHashMap.containsKey(n)) {
			return memozieHashMap.get(n);
		}else {
			BigInteger result = fibonacci(n-1).add(fibonacci(n-2));
			memozieHashMap.put(n, result);
			return result;
		}
	}
	
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		for(int i=0;i<100;i++) {
			System.out.println(fibonacci.fibonacci(i));
		}
	}
}
