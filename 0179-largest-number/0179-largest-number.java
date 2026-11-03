class Solution {
    public String largestNumber(int[] nums) {
        String [] store = new String[nums.length];
        for(int i=0; i<nums.length; i++) {
            store[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(store,(a,b)->(b+a).compareTo(a+b));

        if(store[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<nums.length; i++) {
            sb.append(store[i]);
        }

        return sb.toString();
    }
}