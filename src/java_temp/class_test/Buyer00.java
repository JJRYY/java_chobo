package java_temp.class_test;

import java.util.Arrays;

public class Buyer00 {
	int money = 1000;
	Product[] cart = new Product[3]; // 구입할 제품을 저장하기 위한 배열
	int i = 0; // Product 배열 cart에 사용될 index

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다.");
			return;
		}
		money = money - p.price;
		add(p);
	}

	void add(Product p) {
		if (i >= cart.length) {
			Product[] temp = new Product[cart.length * 2];
			for (int j = 0; j < cart.length; j++) {
				temp[j] = cart[j];
			}
			cart = temp;
		}
		cart[i++] = p;
		
	}

	void summary() {
		int sum = 0;
		for (int k = 0; k < cart.length; k++) {
			sum += cart[k].price;
		}
		
		System.out.println("구입한 물건 : " + Arrays.toString(cart));
		System.out.printf("사용한 금액 : %d%n", sum);
		System.out.printf("남은 금액 : %d%n", money);
	}
}
