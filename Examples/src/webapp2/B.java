package webapp2;
class A{
	int z;
	A(int x){
		z=x;
		System.out.println(z);
	}
}
 class B extends A {
	 B()
	 {
		 super(10);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B();
	}

}
