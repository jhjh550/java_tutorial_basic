import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(12);
		list.add(200);
		list.add(400);
		for(int i=0; i<list.size(); i++){
			int value = list.get(i);
			System.out.println("value : "+value);
		}
	}

}
