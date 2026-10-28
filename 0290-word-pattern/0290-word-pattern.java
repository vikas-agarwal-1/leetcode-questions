class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Map<Character,String> mpp = new HashMap();

        //  String[] words = s.split(" ");
        
        // // Agar donon ki length barabar nahi hai, toh pattern match ho hi nahi sakta
        // if (pattern.length() != words.length) {
        //     return false;
        // }
        
        // // Do maps bijection check karne ke liye
        // Map<Character, String> charMap = new HashMap<>();
        // Map<String, Character> wordMap = new HashMap<>();
        
        // for (int i = 0; i < pattern.length(); i++) {
        //     char ch = pattern.charAt(i);
        //     String word = words[i];
            
        //     // 1. Check karo: Kya yeh character pehle kisi AUR word se map ho chuka hai?
        //     if (charMap.containsKey(ch)) {
        //         if (!charMap.get(ch).equals(word)) {
        //             return false; // Alag value aane par error/false
        //         }
        //     } else {
        //         charMap.put(ch, word);
        //     }
            
        //     // 2. Check karo: Kya yeh word pehle kisi AUR character se map ho chuka hai?
        //     if (wordMap.containsKey(word)) {
        //         if (wordMap.get(word) != ch) {
        //             return false; // Same word dusre character ko assign hone par error/false
        //         }
        //     } else {
        //         wordMap.put(word, ch);
        //     }
        // }
        
        // return true;


        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        
        Map<Character, String> map = new HashMap<>();
        Set<String> usedWords = new HashSet<>(); // Unique words track karne ke liye
        
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            
            if (map.containsKey(ch)) {
                // Agar key present hai, toh value match honi chahiye
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                // Agar key nayi hai, toh check karo ki yeh word pehle kisi aur key ne toh nahi le liya?
                if (usedWords.contains(word)) {
                    return false; // Word unique nahi raha
                }
                
                // Dono jagah entry daal do
                map.put(ch, word);
                usedWords.add(word);
            }
        }
        return true;
    }
}