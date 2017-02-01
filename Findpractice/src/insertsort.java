

public class insertsort {
	/*
	 * public static void swap(int[] data, int a, int b) { int t = data[a];
	 * data[a] = data[b]; data[b] = t; }
	 */
	public static void insertsort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int currentvalue = arr[i];
			int position = i;
			for (int j = i - 1; j >= 0; j--) {
				if (currentvalue < arr[j]) {
					arr[j + 1] = arr[j];
					position -= 1;

				} else {
					break;
				}

			}
			arr[position] = currentvalue;

		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 8, 11, 10 };
		insertsort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		} // TODO Auto-generated method stub

	}

}
