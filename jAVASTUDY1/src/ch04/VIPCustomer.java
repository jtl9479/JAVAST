package ch04;
/*
 * 매출에 더 많은 기여를 하는 단골 고객
 * 제품을 살떄 10%를 할인해 줌 -> VIP전용
 * 보너스 포인트는 제품 가격의 5%를 적립해 줌 -> 기존의 존재
 * 담당 전문 상담원이 배정됨 -> VIP전용
 * 
 * Customer에 구현된것을 사용
 */
public class VIPCustomer extends Customer {

	private int agentId; 			/* 상담원 */
	private double salesRatio; 		/* VIP전용 할인*/
	
	public VIPCustomer() {
		customerGrade ="VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	@Override						/* 상위클래스의 메소드를 하위클래스 전용으로 사용하기 위해 재정의 */
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
	
	public int getAgentId() {		/*agentId private 접근제어자를 지정 외부 접근 불가. getter, setter를 통해서만 접근 가능 */
		return agentId;
	}
	
}
