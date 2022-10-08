
public class Increment {

	static int i = 11;
	private static void m_A() {

		System.out.println(i); //11
		System.out.println(++i); //12
		System.out.println(i++);//12
		System.out.println(i++);//13
		System.out.println(++i);//15
	}
	
	public static void main(String[] args) {
		Increment inc = new Increment();
		
		m_A();
	}
}
