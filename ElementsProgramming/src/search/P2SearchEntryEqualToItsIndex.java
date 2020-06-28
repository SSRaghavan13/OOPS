package search;

public class P2SearchEntryEqualToItsIndex {
    public static int searchEntryEqualToItsIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == mid) {
                return mid;
            }
            else if(arr[mid] > mid) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {-2, 0, 2, 3, 6, 7, 9};
        System.out.println(searchEntryEqualToItsIndex(arr));
    }
}