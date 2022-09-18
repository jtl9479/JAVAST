package dataCons.ArrayListSt;

public class ArrayMain {

	public static void main(String[] args) {
		
		ArrayList numbers = new ArrayList();
		java.util.ArrayList number = new java.util.ArrayList();
	
		numbers.addLast(0);	// 0
		numbers.addLast(10);// 1
		numbers.addLast(20);// 2
		numbers.addLast(30);// 3
		numbers.addLast(40);// 4
		numbers.add(4, 11);
		
		System.out.println(numbers.toString());//객체 주소값 (heap영역)
		System.out.println(numbers.size());//객체 주소값 (heap영역)
		System.out.println(numbers.get(2));//객체 주소값 (heap영역)
		
	}
}
