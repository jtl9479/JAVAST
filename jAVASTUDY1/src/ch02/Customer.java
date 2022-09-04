package ch02;


/*
 * 고객의 속성 : 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율
 * 일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립
 */
public class Customer {

	protected int customerId; 		/* 하위클래스에서는 접근이 가능하지만, 외부 클래스에서는 접근이 불가하다. (상속 가능)*/
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() { 
		customerGrade = "SILVER"; 	/*모든 고객이 실버를 받을 경우 생성자에서 선언을 해준다 */
		bonusRatio = 0.01;  		/* 동일 */
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return bonusPoint; 
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
}
