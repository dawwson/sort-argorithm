import java.util.Scanner;

public class SortUtil {
	protected static void convertInputToArray(int[] arr) {
		System.out.print("10���� ���� ������ �������� �Է��ϼ���. \n=> ");
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
	}
	
	protected static void showResult(int[] arr) {
		System.out.print("\n��� \n=> ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	protected static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
