package search;

public class P1SearchSortedArrayFirstOccuranceK {
    public static int findFirstOccuranceofKSortedArr(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        int mid = left + (right - left) / 2;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(arr[mid] < k)
                left = mid + 1;
            else if(arr[mid] == k) {
                while(arr[mid] == arr[mid - 1])
                    mid--;
                return mid;
            }
            else if(arr[mid] > k)
                right = mid - 1;
        }
        return -1;
    }

    public static int findFirstOccuranceofK(int[] arr, int k) {
        int result = -1;
        int left = 0, right = arr.length - 1;
        int mid = left + (right - left) / 2;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(arr[mid] < k)
                left = mid + 1;
            else if(arr[mid] == k) {
                result = mid;
                right = mid - 1;
            }
            else if(arr[mid] > k)
                right = mid - 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {-14, -10, 2, 108, 108, 243, 285, 285, 285, 401};
        System.out.println(findFirstOccuranceofKSortedArr(arr, 108));
        System.out.println(findFirstOccuranceofKSortedArr(arr, 285));
        System.out.println(findFirstOccuranceofK(arr, 108));
        System.out.println(findFirstOccuranceofK(arr, 285));
    }
}