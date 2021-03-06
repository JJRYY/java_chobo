package java_temp.class_test.teacher;

import java.util.Vector;

public class Buyer {
	int money = 1000;
//	Product[] cart = new Product[3]; 	// 구입한 제품을 저장하기 위한 배열
	Vector<Product> cart = new Vector<Product>();
//	int i = 0; 							// Product배열 cart에 사용될 index

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살수 없습니다.");
			return;
		}
		money = money - p.price;
		cart.add(p);
//		System.out.printf("%s (%d)%n", p, p.price);
	}

	void summary() {
		StringBuilder itemList = new StringBuilder();
		int sum = 0;
		for(Product item: cart) {
			itemList.append(String.format("%s(%d), ", item.toString(),item.price));
			sum += item.price;
		}
		if (itemList.length() == 0) {
			System.out.println("구매 상품 없음");
			System.out.println();
			return;
		} else {
			itemList.replace(itemList.length()-2, itemList.length()-1, "");
		}
		System.out.println("구입한 물건:" + itemList);
		System.out.println("사용한 금액:" + sum);
		System.out.println("남은 금액:" + money);
		System.out.println();
	} // summary()

}
