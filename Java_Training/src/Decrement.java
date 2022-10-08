
public class Decrement {

	static int l = 22;
	private static void m_A() {

		System.out.println(l); //22
		System.out.println(++l); //23
		System.out.println(l++);//23
		System.out.println(l++);//24
		System.out.println(++l);//26
	}
	
	public static void main(String[] args) {
		Decrement inc = new Decrement();
		
		m_A();
}
}
