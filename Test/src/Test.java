
public class Test {

	public static void main(String args[]) {
		test1();
		test2();
		test3();// ��ݮ�����
		test4();// ������ 100 �� 10 ��
	}
	
	public static void test1() {
		Fruit fruit1 = new Apple(10);
		float price1=fruit1.countPrice();
		
		Fruit fruit2 = new Strawberry(10,false);
		float price2=fruit2.countPrice();
		System.out.println("������10��ƻ����10���ݮ�۸�:"+(price1 +price2));// ������10��ƻ����10���ݮ�۸�
	}
	
	public static void test2() {
		Fruit fruit1 = new Apple(10);
		float price1=fruit1.countPrice();
		
		Fruit fruit2 = new Strawberry(10,false);
		float price2=fruit2.countPrice();
		
		Fruit fruit3 = new Mango(10);
		float price3=fruit3.countPrice();
		System.out.println("������10��ƻ����10���ݮ��10��â���۸�:"+(price1 + price2 + price3));// ������10��ƻ����10���ݮ�۸��10��â���۸�
	}
	
	public static void test3() {
		Fruit fruit1 = new Apple(10);
		float price1=fruit1.countPrice();
		
		Fruit fruit2 = new Strawberry(10,true);// �����
		float price2=fruit2.countPrice();
		
		Fruit fruit3 = new Mango(10);
		float price3=fruit3.countPrice();
		System.out.println("������10��ƻ����10���ݮ������ۣ���10��â���۸�:"+(price1 + price2 + price3));// ������10��ƻ����10���ݮ�۸��10��â���۸�
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
		System.out.println("������10��ƻ����10���ݮ��10��â���۸�(������ 100 �� 10 ��):"+(price1 + price2 + price3-dCount*10));// ������10��ƻ����10���ݮ�۸��10��â���۸�
	}
}
