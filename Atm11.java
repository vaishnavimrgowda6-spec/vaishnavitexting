package xyz;



abstract class XYZ {
	
	abstract void withdraw();
	abstract void depoiste();
}
public class Atm1 extends XYZ {
	void withdraw() {
		System.out.println("withdraw");
	}
	void depoiste() {
		System.out.println("Deposite");
	}
	public static void main(String[] args) {
		Atm1 ff = new Atm1();
		ff.withdraw();
		ff.depoiste();
	}
}


