package student;

public class student {
String name;
int age;
void introduce() {
	System.out.println("I am " + name + ", age " + age);}
	public static void main(String[]args) {
student s= new student();   //create an object
s.name="vaishnavi"; s.age=21;
s.introduce();
}
}