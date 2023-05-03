import java.util.Scanner;

public class SortUtil {
	protected static void convertInputToArray(int[] arr) {
		System.out.print("10개의 양의 정수를 무작위로 입력하세요. \n=> ");
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
	}
	
	protected static void showResult(int[] arr) {
		System.out.print("\n결과 \n=> ");
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
