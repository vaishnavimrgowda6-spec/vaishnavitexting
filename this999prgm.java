package this9;

public class this9 {
//this 
	int a ;
	int b ;

void	add(int a , int b)
	{
	      this.a=a;
	      this.b=b;
	}
void	add1()
{
	   System.out.println("this is very good"+(a+b));
}
	 public static void main(String[] args) {
			this9 ff = new this9();
		   ff.add(2, 3);
		   ff.add1();
		}
	}
