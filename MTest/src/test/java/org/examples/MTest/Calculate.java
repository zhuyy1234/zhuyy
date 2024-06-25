package org.examples.MTest;

public class Calculate {

	/**
	 * @param kilo1 苹果斤数
	 * @param unitPrice1 苹果单价
	 * @param kilo2 草莓斤数
	 * @param unitPrice2 草莓单价
	 * @return
	 */
	public float test1(int kilo1, float unitPrice1, int kilo2, float unitPrice2) {
		try {
			Fruit fruit1 = new Apple(kilo1, unitPrice1);
			float price1=fruit1.countPrice();
			
			Fruit fruit2 = new Strawberry(kilo2, unitPrice2);
			float price2=fruit2.countPrice();
			
			return price1 +price2;
		}catch(Exception e) {
			e.getStackTrace();
			return -1;
		}
		
	
	}
	
	/**
	 * @param kilo1 苹果斤数
	 * @param unitPrice1 苹果单价
	 * @param kilo2 草莓斤数
	 * @param unitPrice2 草莓单价
	 * @param kilo3 芒果斤数
	 * @param unitPrice3 芒果单价
	 * @param discount 折扣
	 * @return
	 */
	public float test2(int kilo1, float unitPrice1, int kilo2, float unitPrice2, int kilo3, float unitPrice3, float discount) {
		try {
			Fruit fruit1 = new Apple(kilo1,unitPrice1);
			float price1=fruit1.countPrice();
			
			Fruit fruit2 = new Strawberry(kilo2,unitPrice2);
			float price2=fruit2.countPrice();
			
			Fruit fruit3 = new Mango(kilo3,unitPrice3);
			float price3=fruit3.countPrice();
			
			if(discount == 1f) return price1 +price2 + price3;// 不打折
			else return price1 +price2*discount + price3;// 打折
		}catch(Exception e) {
			e.getStackTrace();
			return -1;
		}
		
	}
	
	/**
	 * @param kilo1 苹果斤数
	 * @param unitPrice1 苹果单价
	 * @param kilo2 草莓斤数
	 * @param unitPrice2 草莓单价
	 * @param kilo3 芒果斤数
	 * @param unitPrice3 芒果单价
	 * @param sum1 总价每满一个额度
	 * @param sum2 减去一个金额
	 * @return
	 */
	public float test3(int kilo1, float unitPrice1, int kilo2, float unitPrice2, int kilo3, float unitPrice3, int sum1,int sum2) {
		try {
			Fruit fruit1 = new Apple(kilo1,unitPrice1);
			float price1=fruit1.countPrice();
			
			Fruit fruit2 = new Strawberry(kilo2,unitPrice2);
			float price2=fruit2.countPrice();
			
			Fruit fruit3 = new Mango(kilo3,unitPrice3);
			float price3=fruit3.countPrice();
			
			float count = (price1 + price2 + price3)/sum1;// 购物满 sum1减 sum2 块，计算有多少个sum1
			Double dCount = Math.floor(count);// 向下取整
			
			return price1 + price2 + price3-dCount.floatValue()*sum2;// 购物满 sum1减 sum2，总价减去
		}catch(Exception e) {
			e.getStackTrace();
			return -1;
		}
	}
}

