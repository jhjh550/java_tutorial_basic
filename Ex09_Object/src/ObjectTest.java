
public class ObjectTest {

	public static void main(String[] args) {
		class MyClass{
			int num;
			@Override
			public boolean equals(Object obj) {
				MyClass other = (MyClass) obj;
				return num == other.num;
			}

			@Override
			public String toString() {
				return "hello world "+num;
			}			
		}
		
		MyClass a = new MyClass();
		a.num = 100;
		MyClass b = new MyClass();
		b.num = 100;
		
		System.out.println(a);
		System.out.println(b);
		if(a.equals(b))
			System.out.println("same");
//		Log.d("a","b");
	}

}
