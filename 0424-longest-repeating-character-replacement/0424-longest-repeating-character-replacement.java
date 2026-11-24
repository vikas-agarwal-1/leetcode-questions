class Solution {
    public int characterReplacement(String s, int k) {
        int maxi = 0;
        
        for(char target = 'A'; target <= 'Z'; target++) {
            int left = 0;
            int nonTargetCount = 0;

            for(int right = 0; right <s.length(); right++) {
                if(s.charAt(right) != target) {
                    nonTargetCount++;
                }

                while(nonTargetCount > k) {
                    if(s.charAt(left) != target) {
                        nonTargetCount--;
                    }
                    left++;
                }
                maxi = Math.max(maxi, right-left+1);
            }
        }
        return maxi;
    }
}