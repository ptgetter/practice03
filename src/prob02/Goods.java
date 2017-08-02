package prob02;

public class Goods {
	private String name;
	private int price;
	private int count;
	
	public Goods(String name, int price, int count)
	{
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	public void ShowState()
	{
		System.out.printf("%s(가격:%d원)이 %d개 입고 되었습니다.\n",
						name, price, count);
	}
}
