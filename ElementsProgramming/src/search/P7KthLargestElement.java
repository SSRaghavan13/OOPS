package search;

import java.util.Random;

public class P7KthLargestElement {

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static int partition(int[] nums, int startIndex, int endIndex, int pivotIndex) {
        int pivot = nums[pivotIndex];
        swap(nums, endIndex, pivotIndex);
        int storeIndex = startIndex;
        for(int i = startIndex; i <= endIndex; i++) {
            if(nums[i] < pivot) {
                swap(nums, storeIndex, i);
                storeIndex++;
            }
        }
        swap(nums, endIndex, storeIndex);
        return storeIndex;
    }

    public static int quickSelect(int[] nums, int left, int right, int k_smallest) {
        if (left == right)
            return nums[left];
        Random random = new Random();
        int pivotIndex = left + random.nextInt(right - left);
        pivotIndex = partition(nums, left, right, pivotIndex);
        if(pivotIndex == k_smallest)
            return nums[pivotIndex];
        else if(k_smallest < pivotIndex)
            return quickSelect(nums, left, pivotIndex - 1, k_smallest);
        else
            return quickSelect(nums, pivotIndex + 1, right, k_smallest);
    }

    public static int kthLargest(int[] nums, int k) {
        int len = nums.length;
        return quickSelect(nums, 0, len - 1, len - k);
    }

    public static void main(String[] args) {
        System.out.println(kthLargest(new int[] {3,1,5,6,4,2}, 2));
    }
}