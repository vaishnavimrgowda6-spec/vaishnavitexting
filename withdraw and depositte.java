package xyz;
//OOPS
//inheritance , ploymor 1) over laod / overrding
//, encap , abst
class Atm {
	void withdraw() {
		System.out.println(" withdraw logic");
	}
	void depoiste() {
		System.out.println(" depositte logic");
	}
}
public class xyz extends Atm{

	public static void main(String[] args) {
xyz ff = new xyz();
ff.withdraw();
ff.depoiste();
	}
}

