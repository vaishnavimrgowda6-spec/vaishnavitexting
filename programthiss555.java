package this2;

public class this4 {
	// this
		int a =10;
		int b =20;

	   void	add(int a , int b)
		{
			System.out.println("Hello" +(this.a+this.b));
			System.out.println("Hello" +(a+b));
		}
		 public static void main(String[] args) {
				this4 ff = new this4();
			   ff.add(2, 3);
			}
		}

