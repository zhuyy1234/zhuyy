
public class Fruit {

	public float unitPrice;// ����
	public int kilo;// ����
	public float discount;// �ۿ�
	public boolean isDiscount =false; // �Ƿ����
	
	public float countPrice() {
		if(isDiscount) return this.unitPrice*this.kilo*this.discount;
		else return this.unitPrice*this.kilo;
	}
}
