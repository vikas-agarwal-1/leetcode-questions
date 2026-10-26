class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            
            // If left character is not alphanumeric, move left pointer right
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } 
            // If right character is not alphanumeric, move right pointer left
            else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } 
            // If both are alphanumeric, compare them
            else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false; // Not a palindrome
                }
                left++;
                right--;
            }
        }
        return true;


        // brute approach
        // String clean = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        // StringBuilder sb = new StringBuilder(clean).reverse();
        // String reversed = sb.toString();

        // return clean.equals(reversed);



        
    }
}