class Solution {
    public int longestSubstring(String s, int k) {
        int maxi = 0;

        for(int i =0; i<s.length(); i++) {
            Map<Character, Integer> map = new HashMap();

            for(int j=i; j<s.length(); j++) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                boolean valid = true;

                for(int freq : map.values()) {
                    if(freq < k) {
                        valid = false;
                        break;
                    }
                }

                if(valid) {
                    maxi = Math.max(maxi, j-i+1);
                }
            }
        }
        return maxi;
    }
}