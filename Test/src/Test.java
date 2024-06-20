
public class Test {

	public static void main(String args[]) {
		test1();
		test2();
		test3();// 草莓打八折
		test4();// 购物满 100 减 10 块
	}
	
	public static void test1() {
		Fruit fruit1 = new Apple(10);
		float price1=fruit1.countPrice();
		
		Fruit fruit2 = new Strawberry(10,false);
		float price2=fruit2.countPrice();
		System.out.println("购买了10斤苹果和10斤草莓价格:"+(price1 +price2));// 购买了10斤苹果和10斤草莓价格
	}
	
	public static void test2() {
		Fruit fruit1 = new Apple(10);
		float price1=fruit1.countPrice();
		
		Fruit fruit2 = new Strawberry(10,false);
		float price2=fruit2.countPrice();
		
		Fruit fruit3 = new Mango(10);
		float price3=fruit3.countPrice();
		System.out.println("购买了10斤苹果和10斤草莓和10斤芒果价格:"+(price1 + price2 + price3));// 购买了10斤苹果和10斤草莓价格和10斤芒果价格
	}
	
	public static void test3() {
		Fruit fruit1 = new Apple(10);
		float price1=fruit1.countPrice();
		
		Fruit fruit2 = new Strawberry(10,true);// 打八折
		float price2=fruit2.countPrice();
		
		Fruit fruit3 = new Mango(10);
		float price3=fruit3.countPrice();
		System.out.println("购买了10斤苹果和10斤草莓（打八折）和10斤芒果价格:"+(price1 + price2 + price3));// 购买了10斤苹果和10斤草莓价格和10斤芒果价格
	}
	
	public static void test4() {
		Fruit fruit1 = new Apple(10);
		float price1=fruit1.countPrice();
		
		Fruit fruit2 = new Strawberry(10,false);
		float price2=fruit2.countPrice();
		
		Fruit fruit3 = new Mango(10);
		float price3=fruit3.countPrice();
		
		float count = (price1 + price2 + price3)/100;
		Double dCount = Math.floor(count);
		System.out.println("购买了10斤苹果和10斤草莓和10斤芒果价格(购物满 100 减 10 块):"+(price1 + price2 + price3-dCount*10));// 购买了10斤苹果和10斤草莓价格和10斤芒果价格
	}
}
