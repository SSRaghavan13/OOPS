package MostFrequent;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int total = 0;
        int i = 0, j = 0;
        while(i < height.length - 1) {
            j = i + 1;
            int curr = 0;
            while(j <= height.length - 2 && (height[i] > height[j]))
                j++;
            curr = Math.min(height[i], height[j]) * (j - i - 1);
            System.out.println((curr));
            for(int k = i + 1; k < j; k++)
                curr -= height[k];
            total += curr;
            i = j;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[] {0,1,0,3,1,0,1,2,2,1,2,1}));
        System.out.println(trap(new int[] {2,0,2}));
    }
}