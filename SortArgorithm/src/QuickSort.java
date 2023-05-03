public class QuickSort {

	public static void main(String[] args) {
		int[] nums = new int[10];
		
		// 1. 10개의 입력값을 받아서 배열에 저장한다.
		SortUtil.convertInputToArray(nums);
		
		// 2. 퀵 정렬
		quickSort(nums, 0, nums.length - 1);

		// 3. 정렬이 끝나면 결과를 출력한다.
		SortUtil.showResult(nums);
	}

	/**
	 * 재귀 함수
	 * @param arr - 정렬될 배열
	 * @param left - 정렬범위의 시작 인덱스
	 * @param right - 정렬범위의 마지막 인덱스
	 */
	private static void quickSort(int[] arr, int left, int right) {
		// 1. 기저 조건 => left와 right의 위치가 같으면 종료
		if (left >= right) {
			return;			
		}

		// 2. 배열을 분할하고 피벗의 위치를 가져온다.
		int pivot = partition(arr, left, right);
		// 3-1. 피벗 왼쪽에 대해 sort 메서드를 재귀적으로 호출한다.
		quickSort(arr, left, pivot - 1);
		// 3-2. 피벗 오른쪽에 대해 sort 메서드를 재귀적으로 호출한다.
		quickSort(arr, pivot + 1, right);
	}
	
	/**
	 * 분할 함수
	 * - 피벗보다 큰 값은 피벗 오른쪽으로
	 * - 피벗보다 작은 값은 피벗 왼쪽으로 
	 * @param arr - 분할하고자 하는 배열
	 * @param left - 가장 왼쪽에 있는 값 인덱스
	 * @param right - 가장 오른쪽에 있는 값 인덱스
	 * @return 피벗의 인덱스
	 */
	private static int partition(int[] arr, int left, int right) {
		// 1. 항상 가장 오른쪽 원소를 피벗으로 한다.
		int pivot = right;  // pivot
		int first = left;  // 배열 범위를 기억해두기 위한 변수
		int last = right;

		// 2. 피벗 바로 왼쪽에서 오른쪽 포인터 시작
		right--;
	
		while (true) {
			// 2-1. 왼쪽에서 시작해서 피벗보다 크거나 같은 값 찾기
			while (left <= last && arr[left] < arr[pivot])
				left++;
			// 2-2. 오른쪽에서 시작해서 피벗보다 작거나 같은 값 찾기
			while (right > first && arr[right] > arr[pivot]) 
				right--;
			// 2-3. left, right가 교차하거나 만나면 left와 pivot을 교환.
			if (left >= right) {
				SortUtil.swap(arr, left, pivot);
				break;
				// 2-4. left, right가 아직 교차하지 않았으면 둘을 교환.
			} else {
				SortUtil.swap(arr, left, right);
				left++;
				right--;
			}
		}

		// 3-1. 옮겨진 pivot의 위치를 반환(=left).
		return left;
	}
}
