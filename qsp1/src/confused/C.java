package confused;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1=new A();
		PF.init(a1); // this is not needed when you call the init method inside the constructor 
		System.out.println(a1.s);
	}

}
