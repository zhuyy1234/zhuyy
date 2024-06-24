package org.examples.MTest;

public class Calculate {

	/**
	 * @param kilo1 苹果斤数
	 * @param kilo2 草莓斤数
	 * @return
	 */
	public float test1(int kilo1, int kilo2) {
		try {
			Fruit fruit1 = new Apple(kilo1);
			float price1=fruit1.countPrice();
			
			Fruit fruit2 = new Strawberry(kilo2,false);
			float price2=fruit2.countPrice();
			
			return price1 +price2;
		}catch(Exception e) {
			e.getStackTrace();
			return -1;
		}
		
	
	}
	
	/**
	 * @param kilo1 苹果斤数
	 * @param kilo2 草莓斤数
	 * @param kilo3 芒果斤数
	 * @param bool 草莓是否打折 true：打折，false：不打折
	 * @return
	 */
	public float test2(int kilo1, int kilo2, int kilo3, boolean bool) {
		try {
			Fruit fruit1 = new Apple(kilo1);
			float price1=fruit1.countPrice();
			
			Fruit fruit2 = new Strawberry(kilo2,bool);
			float price2=fruit2.countPrice();
			
			Fruit fruit3 = new Mango(kilo3);
			float price3=fruit3.countPrice();
			
			return price1 +price2 + price3;
		}catch(Exception e) {
			e.getStackTrace();
			return -1;
		}
		
	}
	
	/**
	 * @param kilo1 苹果斤数
	 * @param kilo2 草莓斤数
	 * @param kilo3 芒果斤数
	 * @return
	 */
	public float test3(int kilo1, int kilo2, int kilo3) {
		try {
			Fruit fruit1 = new Apple(kilo1);
			float price1=fruit1.countPrice();
			
			Fruit fruit2 = new Strawberry(kilo2,false);
			float price2=fruit2.countPrice();
			
			Fruit fruit3 = new Mango(kilo3);
			float price3=fruit3.countPrice();
			
			float count = (price1 + price2 + price3)/100;// 购物满 100减 10 块，计算有多少个100
			Double dCount = Math.floor(count);// 向下取整
			
			return price1 + price2 + price3-dCount.floatValue()*10;// 购物满 100减 10 块，总价减去
		}catch(Exception e) {
			e.getStackTrace();
			return -1;
		}
	}
}

