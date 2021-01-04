package org.kodluyoruz;

public class Main {

	public static void main(String[] args) {

		BlockQueue<String> bqStr = new BlockQueue<String>();

		bqStr.add("Yunus");
		bqStr.add("Topuz");
		bqStr.add("Java");

		System.out.println("Peek : " + bqStr.peek());
		
		System.out.println("Poll : " + bqStr.poll());
		System.out.println("Poll : " + bqStr.poll());
		System.out.println("Poll : " + bqStr.poll());

		System.out.println("**************");
		
		BlockQueue<Integer> bqInt = new BlockQueue<Integer>();
		
		bqInt.add(24);
		bqInt.add(34);
		bqInt.add(44);
		
		System.out.println("Peek : " + bqInt.peek());
		
		System.out.println("Poll : " + bqInt.poll());
		System.out.println("Poll : " + bqInt.poll());
		System.out.println("Poll : " + bqInt.poll());

	}
}
