import java.util.Scanner;

public class LunarYear {
//	������ 4�� �������� 0 �̸� ������ �� ����
//	�׷��� 100 ���� ���������� ���
//	�ٽ� 400 ���� ���������� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		if(year % 400 == 0){
			System.out.println(year+"�� �����Դϴ�.");
		}else if(year % 100 == 0){
			System.out.println(year+"���� ����Դϴ�.");			
		}else if(year % 4 == 0){
			System.out.println(year+"�� �����Դϴ�.");
		}else{
			System.out.println(year+"���� ����Դϴ�.");
		}
		
		scanner.close();
	}

}