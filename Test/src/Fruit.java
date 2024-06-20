
public class Fruit {

	public float unitPrice;// 单价
	public int kilo;// 重量
	public float discount;// 折扣
	public boolean isDiscount =false; // 是否打折
	
	public float countPrice() {
		if(isDiscount) return this.unitPrice*this.kilo*this.discount;
		else return this.unitPrice*this.kilo;
	}
}
