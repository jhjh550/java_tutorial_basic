import java.util.Scanner;

public class LunarYear {
//	연도를 4로 나눈값이 0 이면 윤년일 수 있음
//	그러나 100 으로 나누어지면 평년
//	다시 400 으로 나누어지면 윤년

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		if(year % 400 == 0){
			System.out.println(year+"는 윤년입니다.");
		}else if(year % 100 == 0){
			System.out.println(year+"년은 평년입니다.");			
		}else if(year % 4 == 0){
			System.out.println(year+"는 윤년입니다.");
		}else{
			System.out.println(year+"년은 평년입니다.");
		}
		
		scanner.close();
	}

}
