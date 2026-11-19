class Solution {
    public int maxArea(int[] height) {
        // Brute Approach
        // int maxArea = 0;
        // for(int i=0; i<height.length; i++) {
        //     for(int j=i+1; j<height.length; j++) {
        //         int width = j-i;
        //         int heigh = Math.min(height[i], height[j]);
        //         int area = width * heigh;
        //         if(area > maxArea) {
        //             maxArea = area;
        //         }
        //     }
        // }
        // return maxArea;

        // Optimal Approach using two pointer

        int i = 0, j= height.length-1;
        int maxArea = 0;
        while(i<j) {
            int width = j-i;
            int heigh = Math.min(height[i], height[j]);

            int area = width * heigh;

            if(area > maxArea) {
                maxArea = area;
            }

            if(height[i] > height[j]) {
                j--;
            }
            else {
                i++;
            }
        }
        return maxArea;
    }
}