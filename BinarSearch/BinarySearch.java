class BinarySearch{
	int binarySearch(int arr[], int l, int r, int target){
		if (r >=l) {
			int mid = l + (r-l) / 2;

			if(arr[mid] == target) return mid;
			else if(arr[mid] > target){
				return binarySearch(arr,l,mid-1,target);
			}else{
				return binarySearch(arr, mid+1,r,target);
			}
		}

		// if the element is not presented in array
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int[] arr = {5,12,17,25,65,87};
		int target = 87;
		int length = arr.length;
		int result = binarySearch.binarySearch(arr,0,length,target);
		if(result == -1){
			System.out.println("Element is not presented");
		}else{
			System.out.println("Element found at index " + result);
		}
	}
}