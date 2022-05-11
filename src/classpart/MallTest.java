package classpart;

public class MallTest {

	public static void main(String[] args) {
		Mall order1 = new Mall();
		order1.orderNum = 201803120001L;
		order1.orderID = "abc123";
		order1.date = "2018년 3월 12일";
		order1.customer = "홍길순";
		order1.productNum = "PD0345-12";
		order1.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호 : " + order1.orderNum);
		System.out.println("주문자 아이디 : " + order1.orderID);
		System.out.println("주문 날짜 : " + order1.date);
		System.out.println("주문자 이름 : " + order1.customer);
		System.out.println("주문 상품 번호 : " + order1.productNum);
		System.out.println("배송주소 : " + order1.address);
	}

}
