public class ExceptionTest {
	public static void main(String[] args) throws InterruptedException {
		class AClass{
			public void test() throws InterruptedException{
				Thread.sleep(1000);
			};
		}
		
		AClass acls2 = new AClass();
		acls2.test();
		
		try {
			Thread.sleep(1000);			
			AClass acls=new AClass();
			acls.test();
			int a = 100/1;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(ArithmeticException e){
			e.printStackTrace();
		} finally{
			
		}
		
		System.out.println("end");
	}
}
