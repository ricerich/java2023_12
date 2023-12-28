package test04;

public class Goods1 {
	// 1.멤버변수(field, member variable)
	private String name;
	int price;
	int numberOfStock;
	int sold;

	// 2.생성자(Constructor)
	Goods1(String n, int p, int nStock, int s) {
		name = n;
		price = p;
		numberOfStock = nStock;
		sold = s;
	}

	// 3.메소드(method)
	public String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	int getNumberOfStock() {
		return numberOfStock;
	}

	int getSold() {
		return sold;
	}

}
