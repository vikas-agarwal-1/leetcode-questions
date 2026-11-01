class Solution {
    public int firstUniqChar(String s) {
        // Map<Character, Integer> freq = new HashMap<>();

        // for(char c : s.toCharArray()) {
        //     freq.put(c, freq.getOrDefault(c, 0)+1);
        // }

        // for(int i=0; i<s.length(); i++) {
        //     if(freq.get(s.charAt(i)) == 1) {
        //         return i;
        //     }
        // }
        // return -1;

        // int[] freq = new int[26];

        // for (int i = 0; i < s.length(); i++) {
        //     freq[s.charAt(i) - 'a']++;
        // }

        // for (int i = 0; i < s.length(); i++) {
        //     if (freq[s.charAt(i) - 'a'] == 1) {
        //         return i;
        //     }
        // }

        // return -1;  

        // Character -> Pehla index (ya -1 agar duplicate hai)
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, i); // Pehli baar aaya, index store kiya
            } else {
                map.put(c, -1); // Dobara aaya, toh -1 mark kar diya (Not Unique)
            }
        }
        
        // Ab LinkedHashMap mein insertion order ke mutabik loop chalayenge
        for (int index : map.values()) {
            if (index != -1) {
                return index; // Pehla unique index milte hi return kar do
            }
        }
        
        return -1; 
    }
}