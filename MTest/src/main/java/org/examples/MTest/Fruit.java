package org.examples.MTest;

public class Fruit {

	public float unitPrice;// 单价
	public int kilo;// 重量
	
	public Fruit() {
	}
	
	public Fruit(int kilo, float unitPrice) {
		this.kilo = kilo;
		this.unitPrice = unitPrice;
	}
	
	public float countPrice() {
		return this.unitPrice*this.kilo;
	}
}

