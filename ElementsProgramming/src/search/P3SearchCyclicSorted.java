package search;

public class P3SearchCyclicSorted {
    public static int searchCyclicSorted(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if(nums[mid] == k)
                return mid;
            else if(nums[left] <= nums[mid]) {
                if(nums[left] <= k && k <= nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else {
                if(nums[mid] <= k && k <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }

    public static int searchSmallest(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while(left < right) {
            mid = left + (right - left) / 2;
            if(nums[mid] > nums[right])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = {378, 478, 550, 631, 103, 203, 220, 234, 279, 368};
        System.out.println(searchCyclicSorted(arr, 378));
        System.out.println(searchSmallest(arr));
    }
}