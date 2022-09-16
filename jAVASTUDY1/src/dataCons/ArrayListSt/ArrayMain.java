package dataCons.ArrayListSt;

public class ArrayMain {

	public static void main(String[] args) {
		
		ArrayList numbers = new ArrayList();
	
		numbers.addLast(0);	// 0
		numbers.addLast(10);// 1
		numbers.addLast(20);// 2
		numbers.addLast(30);// 3
		numbers.addLast(40);// 4
		numbers.add(1, 40);
		
		System.out.println(numbers.showList());
		
	}
}
