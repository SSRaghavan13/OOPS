package search;

public class P5Search2DMatrix {
    public static boolean matrixSearch(int[][] nums, int n) {
        int rowEnd = nums.length - 1;
        int colEnd = nums[0].length - 1;
        int currRow = 0, currCol = colEnd;
        while(currRow <= rowEnd && currCol >= 0) {
            if(nums[currRow][currCol] == n)
                return true;
            else if(nums[currRow][currCol] < n) {
                currRow++;
            }
            else {
                currCol--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {{-1,2,4,4,6},
                        {1,5,5,9,21},
                        {3,6,6,9,22},
                        {6,8,9,12,25},
                        {8,10,12,13,40}};
        System.out.println(matrixSearch(nums, 8));
    }

}