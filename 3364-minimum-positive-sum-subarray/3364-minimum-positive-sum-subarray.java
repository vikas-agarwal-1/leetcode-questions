class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        // int mini = Integer.MAX_VALUE;
        // for(int i=0; i<nums.size(); i++) {
        //     int sum = 0;
        //     for(int j=i; j<nums.size(); j++) {
        //         sum += nums.get(j);
        //         int length = j-i+1;
        //         if(length >= l && length <=r && sum > 0) {
        //             mini = Math.min(mini, sum);
        //         }
        //     }
        // }
        // return mini == Integer.MAX_VALUE ? -1 : mini;

        // optimal approach
        int ans = Integer.MAX_VALUE;

        for(int k = l; k<=r; k++) {
            int sum = 0;
            for(int i=0; i<k; i++) {
                sum += nums.get(i);
            }

            if(sum > 0) {
                ans = Math.min(ans, sum);
            }

            for(int i = k; i<nums.size(); i++) {
                sum += nums.get(i);
                sum -= nums.get(i-k);

                if(sum > 0) {
                    ans = Math.min(ans,sum);
                }
            }
        }

        return ans == Integer.MAX_VALUE? -1 : ans;
    }
}