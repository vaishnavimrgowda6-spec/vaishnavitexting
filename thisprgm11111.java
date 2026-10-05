package this8;
//this
class parent {
	int a = 10;
	int b = 20;
}

public class this8 extends parent{
	int a = 5;
	int b = 6;

	void add(int a, int b) {
		System.out.println(a + b);
	//	System.out.println(c + d);
		System.out.println(this.a + this.b);
		System.out.println(super.a+super.b);
		
	}

	public static void main(String[] args) {
		this8 ff = new this8();
		ff.add(2, 3);
		

	}
}