
public class Inheritance {
	
	public static void main(String[] args) {		
		class ParentClass{
			private int x,y;
			
			public ParentClass(){
				System.out.println("parent class constructor");
			}

			public ParentClass(int x, int y) {
				super();
				this.x = x;
				this.y = y;
			}
			
			public void printxy(){
				System.out.println("parent x ="+x+" y = "+y);
			}
		}
		
		class ChildClass extends ParentClass{
			private int x,y;
			
			public ChildClass(){
				System.out.println("child class constructor");
			}

			public ChildClass(int x, int y) {
				super(x*2, y*3);
				this.x = x;
				this.y = y;
			}	
			
			
		}		
		
		ChildClass child = new ChildClass(3,4);
		child.printxy();

	}

}
